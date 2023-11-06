package Square;

import NonNegativeNumber.NonNegativeNumber;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() throws NonNegativeNumber {
        if(isValid(side))
            return side * side;
        throw new NonNegativeNumber();
    }

    public boolean isValid(double number) {
        if (number <= 0)
            return false;
        return true;
    }

    public double calculatePerimeter() throws NonNegativeNumber {
        if(isValid(side)) {
            return 4 * side;
        }
        throw new NonNegativeNumber();
    }
}
