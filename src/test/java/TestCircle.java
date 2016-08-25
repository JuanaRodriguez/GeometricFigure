import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @autor JuanaRodriguez on 8/24/2016.
 */

public class TestCircle {

    Figures circle;

    @Before
    public void initialize() {
        circle = new Circle(2);
    }

    @Test
    public void test_calculateArea() {
        double areaExpected = 12.566370614359172;
        assertEquals(areaExpected, circle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter() {
        double perimeterExpected = 12.566370614359172;
        assertEquals(perimeterExpected, circle.calculatePerimeter());
    }
}
