package tests;



import main.Location;
import main.Product;
import main.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {

    private Warehouse warehouse;

    @BeforeEach
    public void setUp() {
        Location location = new Location("Main Branch", "UB");
        warehouse = new Warehouse("MyWarehouse", location);
    }

    @Test
    public void testAddProduct() {
        Product product = new Product("Laptop", "Electronics", 5, "12345");
        warehouse.addProduct(product);

        assertEquals(1, warehouse.getProducts().size());
        assertEquals("Laptop", warehouse.getProducts().get(0).getName());
    }

    @Test
    public void testRemoveProduct() {
        Product product = new Product("Monitor", "Electronics", 2, "67890");
        warehouse.addProduct(product);
        warehouse.removeProduct(product);

        assertEquals(0, warehouse.getProducts().size());
    }

    @Test
    public void testAddNullProduct() {
        assertThrows(IllegalArgumentException.class, () -> {
            warehouse.addProduct(null);
        });
    }

    @Test
    public void testRemoveUnexistingProduct() {
        Product fakeProduct = new Product("Ghost", "None", 0, "00000");
        warehouse.removeProduct(fakeProduct); // Should do nothing, no error
        assertEquals(0, warehouse.getProducts().size());
    }
}

