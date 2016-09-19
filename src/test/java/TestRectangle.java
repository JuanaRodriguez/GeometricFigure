import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@link Rectangle}
 */
public class TestRectangle {
    Shapes rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(2.0, 4.0);
    }

    @Test
    public void test_calculateArea() {
        double areaExpected = 8.0;
        assertEquals(areaExpected, rectangle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter() {
        double perimeterExpected = 12.0;
        assertEquals(perimeterExpected, rectangle.calculatePerimeter());
    }
}
