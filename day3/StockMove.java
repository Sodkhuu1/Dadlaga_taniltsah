package day3;

import java.util.Date;

public class StockMove {
    private Product product;
    private int quantity;
    private String type; // "in" or "out"
    private Date date;

    public StockMove(Product product, int quantity, String type, Date date) {
        this.product = product;
        this.quantity = quantity;
        this.type = type;
        this.date = date;

        if (type.equals("in")) {
            product.addStock(quantity);
        } else if (type.equals("out")) {
            product.removeStock(quantity);
        }
    }

    public void printInfo() {
        System.out.println("StockMove: " + type + " " + quantity + " of " + product.getName() +
            " on " + date.toString());
    }
}

