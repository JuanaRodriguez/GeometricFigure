/**
 * @autor JuanaRodriguez on 8/24/2016.
 * The Triangle class calculate the area and the perimeter of a triangle
 */
public class Triangle implements Shapes {

    private static final int CONSTANT_FORMULA = 2;
    private double base;
    private double height;
    private double side;

    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return (base * height) / CONSTANT_FORMULA;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return (side * side * side);
    }
}
