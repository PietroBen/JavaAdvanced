package JavaAdvanced.OOP._2;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println(height * width);
    }
}
