import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JuanaRodriguez on 8/24/2016.
 */
public class TestTriangle {
    @Test
    public void test_calculateArea(){
        Triangle triangle = new Triangle();
        double areaExpected = 2.0;
        assertEquals(areaExpected,triangle.calculateArea(2,2),0);
    }
    @Test
    public void test_calculatePerimeter(){
        Triangle triangle = new Triangle();
        double perimeterExpected = 8.0;
        assertEquals(perimeterExpected,triangle.calculatePerimeter(2),0);
    }
}
