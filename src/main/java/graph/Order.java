package graph;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private final String orderid;


    private final ArrayList<Purchase> purchases;
    private final Date order_date;
    private final Merchant merchant;
    private final IPAddress ip;


    public Order(String orderid, ArrayList<Purchase> purchases,
                 Date order_date, Merchant merchant, IPAddress hostname) {
        this.orderid = orderid;
        this.purchases = purchases;
        this.order_date = order_date;
        this.merchant = merchant;
        this.ip = hostname;
    }

    public String getOrderid() {
        return orderid;
    }

    public ArrayList<Purchase> getProducts() { return purchases; }

    public Date getOrder_date() {
        return order_date;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public IPAddress getIp() {
        return ip;
    }

    public String getUniqueOrderid() {
        return String.format("%d_%s", this.merchant.getMid(), this.getOrderid());
    }

    public double totalAmount() {
        double amount = 0;
        for ( Purchase p: purchases ) {
            amount += p.getAmount();
        }
        return amount;
    }
}
