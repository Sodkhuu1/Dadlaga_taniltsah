import java.util.Date;

public class StockMove {
    private Product product;
    private int quantity;
    private String type; // "in" or "out"
    private Date date;
    private Location fromLocation;
    private Location toLocation;

    public StockMove(Product product, int quantity, String type, Location fromLocation, Location toLocation) {
        this.product = product;
        this.quantity = quantity;
        this.type = type;
        this.date = new Date();
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public String toString() {
        return "StockMove: " + product.getName() + ", Qty: " + quantity +
                ", Type: " + type + ", Date: " + date;
    }
}
