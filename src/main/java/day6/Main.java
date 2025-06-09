package day6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Location location = new Location("Central Warehouse", "Ulaanbaatar");
        Warehouse warehouse = new Warehouse("Main Warehouse", location);

        while (true) {
            System.out.println("\n Warehouse Menu ");
            System.out.println("1. Baraa nemeh");
            System.out.println("2. Baraag hasah");
            System.out.println("3. Buh baraani neriin jagsaalt");
            System.out.println("0. Garah");
            System.out.print("Songoltoo oruulna uu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (choice == 1) {
                System.out.print("Baraani neriig oruulna uu: ");
                String name = scanner.nextLine();
                System.out.print("Angilaliig oruulna uu: ");
                String category = scanner.nextLine();
                System.out.print("Too hemjeeg oruulna uu: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); 
                if (quantity < 0) {
                    System.out.println("Too hemjee surug baij bolohgui!");
                    continue;
                }
                System.out.print("Barcode oruulna uu (5 orontoi too): ");
                String barcode = scanner.nextLine();
                if (!barcode.matches("\\d{5}")) {
                    System.out.println("Buruu! Barcode ni 5 orontoi baih ystoi.");
                    continue;
                }

                Product product = new Product(name, category, quantity, barcode);
                warehouse.addProduct(product);
                System.out.println(" Baraa nemegdlee.");
            }

            else if (choice == 2) {
                System.out.print("Hasah baraanihaa neriig oruulna uu: ");
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
                    System.out.println(" Baraa haslaa.");
                } else {
                    System.out.println(" Baraa oldsongui.");
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
