/**
 * @autor juana Rodriguez on 8/24/2016.
 */
public class Square extends Figures {

    public static final int NUMBER_SIDE = 4;
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return side * NUMBER_SIDE;
    }
}
