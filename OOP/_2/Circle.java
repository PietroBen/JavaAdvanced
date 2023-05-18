package JavaAdvanced.OOP._2;

public class Circle extends Shape{

    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * Math.pow((height / 2), 2));
    }
}
