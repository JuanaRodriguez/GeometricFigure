/**
 * @autor JuanaRodriguez on 8/24/2016.
 * The Circle class calculates the area and the perimeter of a circle
 */
public class Circle implements Shapes {

    private static final int CONSTANT_FORMULA = 2;
    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return Math.PI * (radio * radio);
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return Math.PI * radio * CONSTANT_FORMULA;
    }
}
