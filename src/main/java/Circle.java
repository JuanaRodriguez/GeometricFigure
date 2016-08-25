/**
 * Created by JuanaRodriguez on 8/24/2016.
 */
public class Circle extends Figures {

    public double calculateArea(double radio){
        return Math.PI * (radio * radio);
    }
    public double calculatePerimeter(double radio){
        return Math.PI* radio * 2;
    }
}
