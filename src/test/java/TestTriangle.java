import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @autor JuanaRodriguez on 8/24/2016.
 */
public class TestTriangle {
    Figures triangle;

    @Before
    public void initialize() {
        triangle = new Triangle(2, 2, 2);
    }

    @Test
    public void test_calculateArea() {
        double areaExpected = 2.0;
        assertEquals(areaExpected, triangle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter() {
        double perimeterExpected = 8.0;
        assertEquals(perimeterExpected, triangle.calculatePerimeter());
    }
}
