import NonNegativeNumber.NonNegativeNumber;
import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    public void testAreaOfRectangle() throws NonNegativeNumber {
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.calculateArea(5, 7), 35);
    }

    @Test
    public void testNonNegativeNumbers() {
        Rectangle rectangle = new Rectangle();
        assertThrows(NonNegativeNumber.class, () -> rectangle.calculateArea(-5, 7));
    }
}
