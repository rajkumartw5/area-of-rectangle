import NonNegativeNumber.NonNegativeNumber;
import Square.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    public void testAreaOfSquareWithPositiveNumbers() throws NonNegativeNumber {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea());
    }

    @Test
    public  void shouldThrowExceptionIfSideIsNegative() throws NonNegativeNumber {
        Square square = new Square(-5);
        assertThrows(NonNegativeNumber.class, () -> square.calculateArea());
    }
}
