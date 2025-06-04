package day3;

public class Main {
    public static void main(String[] args) {
        Product item = new Product("Notebook", "Electronic", 2500.0, 100);
        item.printInfo();

        item.addStock(50);
        item.removeStock(30);
        item.printInfo();
    }
}

