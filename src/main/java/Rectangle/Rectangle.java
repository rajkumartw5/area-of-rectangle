package Rectangle;

import NonNegativeNumber.NonNegativeNumber;

public class Rectangle {
    public double calculateArea(double length, double breadth) throws NonNegativeNumber {
        if (length < 0 || breadth < 0)
            throw new NonNegativeNumber();
        else
            return (length*breadth);
    }

    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}
