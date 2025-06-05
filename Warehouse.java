import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String name;
    private Location location;
    private List<Product> products;
    private List<StockMove> stockMoves;

    public Warehouse(String name, Location location) {
        this.name = name;
        this.location = location;
        this.products = new ArrayList<>();
        this.stockMoves = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in warehouse.");
        } else {
            System.out.println("Products in warehouse:");
            for (Product product : products) {
                product.printInfo();
            }
        }
    }

    public void addStockMove(StockMove move) {
        stockMoves.add(move);
    }

    public void listStockMoves() {
        System.out.println("Stock movements:");
        for (StockMove move : stockMoves) {
            System.out.println(move);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Product> getProducts() {
        return products;
    }

}
