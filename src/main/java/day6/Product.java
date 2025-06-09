package day6;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private String barcode;

    public Product(String name, String category, int quantity, String barcode) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println("Product: " + name + " | Category: " + category +
                " | Quantity: " + quantity + " | Barcode: " + barcode);
    }
}
