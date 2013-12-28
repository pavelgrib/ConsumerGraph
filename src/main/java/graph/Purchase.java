package graph;

/**
 * Tiny Type for encapsulating line-items of Order objects
 */
public class Purchase {

    private final Product product;
    private final int quantity;
    private final MoneyAmount price;

    public Purchase(Product product, int quantity, MoneyAmount price) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double getAmount() { return this.quantity * this.price.amountPaid(); }

    public String toString() {
        return String.format("%d of %s for %f each; %f total", this.quantity,
                this.product.getName(), (this.quantity * this.price.amountPaid()));
    }

}
