import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Location location = new Location("Central Warehouse", "Ulaanbaatar");
        Warehouse warehouse = new Warehouse("Main Warehouse", location);

        while (true) {
            System.out.println("\n==== Warehouse Menu ====");
            System.out.println("1. Add product");
            System.out.println("2. Remove product by name");
            System.out.println("3. List all products");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter barcode: ");
                String barcode = scanner.nextLine();

                Product product = new Product(name, category, quantity, barcode);
                warehouse.addProduct(product);
                System.out.println(" Product added.");
            }

            else if (choice == 2) {
                System.out.print("Enter product name to remove: ");
                String name = scanner.nextLine();
                Product toRemove = null;

                for (Product p : warehouse.getProducts()) {
                    if (p.getName().equalsIgnoreCase(name)) {
                        toRemove = p;
                        break;
                    }
                }

                if (toRemove != null) {
                    warehouse.removeProduct(toRemove);
                    System.out.println(" Product removed.");
                } else {
                    System.out.println(" Product not found.");
                }
            }

            else if (choice == 3) {
                warehouse.listProducts();
            }

            else if (choice == 0) {
                System.out.println("👋 Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
