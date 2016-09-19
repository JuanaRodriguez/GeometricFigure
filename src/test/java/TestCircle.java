import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@link Circle}
 */

public class TestCircle {

    private static final int RADIO = 2;
    private Shapes circle;

    @Before
    public void setUp() {
        circle = new Circle(RADIO);
    }

    @Test
    public void test_calculateArea() {
        final double areaExpected = 12.566370614359172;
        assertEquals(areaExpected, circle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter() {
        final double perimeterExpected = 12.566370614359172;
        assertEquals(perimeterExpected, circle.calculatePerimeter());
    }
}
