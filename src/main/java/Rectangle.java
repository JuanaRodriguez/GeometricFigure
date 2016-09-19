/**
 * @autor juana Rodriguez on 8/24/2016.
 * The Rectangle class calculate the area and the perimeter of a rectangle
 */
public class Rectangle implements Shapes {

    private static final int NUMBER_SIDE = 2;
    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return sideOne * sideTwo;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return (sideOne * NUMBER_SIDE) + (sideTwo * NUMBER_SIDE);
    }
}
