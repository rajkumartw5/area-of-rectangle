package Rectangle;

import NonNegativeNumber.NonNegativeNumber;

public class Rectangle {
    public double calculateArea(double length, double breadth) throws NonNegativeNumber {
        if (isValid(length) || isValid(breadth))
            throw new NonNegativeNumber();
        else
            return (length*breadth);
    }

    public double calculatePerimeter(double length, double breadth) throws NonNegativeNumber{
        if (isValid(length) || isValid(breadth))
            throw new NonNegativeNumber();
        else
            return 2 * (length + breadth);
    }

    public boolean isValid(double number) {
        if (number <= 0)
            return false;
        return true;
    }
}
