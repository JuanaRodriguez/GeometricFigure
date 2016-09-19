import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@link Square}
 */

public class TestSquare {

    Shapes square;

    @Before
    public void setUp() {
        square = new Square(2.0);
    }

    @Test
    public void test_calculateArea() {
        double areaExpected = 4.0;
        assertEquals(areaExpected, square.calculateArea());
    }

    @Test
    public void test_calculatePerimeter() {
        double perimeterExpected = 8.0;
        assertEquals(perimeterExpected, square.calculatePerimeter());
    }
}
