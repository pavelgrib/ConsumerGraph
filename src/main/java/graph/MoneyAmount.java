package graph;

/**
 * Created by paul on 12/28/13.
 */
public class MoneyAmount {

    private final double amount;
    private final Currency ccy;

    public MoneyAmount(double amount, Currency ccy) {
        this.amount = amount;
        this.ccy = ccy;
    }

    public double amountPaid() {
        return amount;
    }

    public Currency getCcy() {
        return ccy;
    }
}
