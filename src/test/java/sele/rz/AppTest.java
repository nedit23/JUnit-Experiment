package sele.rz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAddition() {
        assertEquals(30, app.add(10, 20));
    }

    @Test
    public void testMultiplication() {
        assertEquals(20, app.multiply(5, 4));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(5, app.add(10, -5));
    }
}
