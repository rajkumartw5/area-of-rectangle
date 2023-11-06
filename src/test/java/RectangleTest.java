import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testAreaOfRectangle(){
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.calculateArea(5, 7), 35);
    }
}
