package tests;


import main.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testValidProduct() {
        Product product = new Product("Phone", "Electronics", 10, "ABC123");
        assertEquals("Phone", product.getName());
        assertEquals(10, product.getQuantity());
    }

    @Test
    public void testNegativeQuantityThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Tablet", "Electronics", -5, "XYZ987");
        });
    }

    @Test
    public void testEmptyName() {
        Product product = new Product("", "Misc", 1, "000");
        assertEquals("", product.getName());
    }
}

