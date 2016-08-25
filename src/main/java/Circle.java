/**
 * @autor JuanaRodriguez on 8/24/2016.
 * The Circle class calculate the area and the perimeter of a circle
 */
public class Circle extends Figures {

    public static final int CONSTANT_FORMULA = 2;
    double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return Math.PI * (radio * radio);
    }

    public double calculatePerimeter() {
        return Math.PI * radio * CONSTANT_FORMULA;
    }
}
