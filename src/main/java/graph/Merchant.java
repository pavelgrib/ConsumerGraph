package graph;

/**
 * Tiny type for Merchant
 */
public class Merchant {

    private int mid;
    private String name;

    public Merchant(int mid) {
        this.mid = mid;
        this.name = "";
    }

    public Merchant(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public int getMid() { return this.mid; }
    public String getName() { return this.name; }
}
