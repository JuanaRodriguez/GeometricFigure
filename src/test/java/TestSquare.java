import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @autor JuanaRodriguez on 8/24/2016.
 */

public class TestSquare {

    Figures square;

    @Before
    public void initialize() {
        square = new Square(2);
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
