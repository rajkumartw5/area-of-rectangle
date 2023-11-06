import NonNegativeNumber.NonNegativeNumber;
import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    public void testAreaOfRectangle() throws NonNegativeNumber {
        Rectangle rectangle = new Rectangle();
        assertEquals(35, rectangle.calculateArea(5, 7));
    }

    @Test
    public void testNonNegativeNumbers() {
        Rectangle rectangle = new Rectangle();
        assertThrows(NonNegativeNumber.class, () -> rectangle.calculateArea(-5, 7));
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle();
        assertEquals(24, rectangle.calculatePerimeter(5, 7));
    }
}
