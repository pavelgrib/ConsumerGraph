package graph;

import org.neo4j.graphdb.DynamicLabel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 * Build up a graph database of consumers
 * */
public class Builder {

    private static final String USERNAME_KEY = "username";
    private static final String ORDERID_KEY = "uorderid";

    private static final String DB_PATH = "/Users/paul/db/neo4j/test";
    private GraphDatabaseService graphDb;


    private static enum RelTypes implements RelationshipType {
        PLACED_ORDER,
        ORDER_CONTAINS_PRODUCT,
        BROWSED_SITE,
        SELLS_PRODUCT,
        LIVES_AT_LOCATION,
        PURCHASED_AT
    }

    public Builder() {
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
        registerShutdownHook();
    }

    /**
     * this gets called inside a transaction block
     * @param username
     */
    public void newConsumer(Username username) {
        Node consumer = graphDb.createNode(DynamicLabel.label("consumer"));
        consumer.setProperty(USERNAME_KEY, username.getId());
    }

    /**
     * this gets called inside a transaction block
     * @param order
     */
    public void addOrderToConsumer(Order order) {
        Node orderNode = graphDb.createNode(DynamicLabel.label("order"));
        orderNode.setProperty("orderid", order.getOrderid());
    }

    private void registerShutdownHook()
    {
        Runtime.getRuntime()
                .addShutdownHook( new Thread()
                {
                    @Override
                    public void run()
                    {
                        graphDb.shutdown();
                    }
                } );
    }

}
