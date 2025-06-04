package day3;
public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int qty) {
        this.quantity += qty;
    }

    public void removeStock(int qty) {
        if (qty <= this.quantity) {
            this.quantity -= qty;
        } else {
            System.out.println("Not enough stock!");
        }
    }

    public void printInfo() {
        System.out.println("Product: " + name + ", Category: " + category +
            ", Price: " + price + ", Quantity: " + quantity);
    }
    public String getName() {
        return name;
    }

}
