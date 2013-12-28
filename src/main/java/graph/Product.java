package graph;

/**
 * Created by paul on 12/28/13.
 */
public class Product {

    private final String name;
    private final String sku_number;

    public Product(String name, String sku_number) {
        this.name = name;
        this.sku_number = sku_number;
    }

    public String getSku_number() {
        return sku_number;
    }

    public String getName() {
        return name;
    }
}
