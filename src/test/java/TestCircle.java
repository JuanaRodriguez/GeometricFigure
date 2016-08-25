import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JuanaRodriguez on 8/24/2016.
 */
public class TestCircle {
    @Test
    public void test_calculateArea(){
        Circle circle = new Circle();
        double areaExpected = 12.566370614359172;
        assertEquals(areaExpected,circle.calculateArea(2),0);
    }
    @Test
    public void test_calculatePerimeter(){
        Circle circle = new Circle();
        double perimeterExpected = 12.566370614359172;
        assertEquals(perimeterExpected,circle.calculatePerimeter(2),0);
    }
}
