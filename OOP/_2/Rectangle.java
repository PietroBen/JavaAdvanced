package JavaAdvanced.OOP._2;

public class Rectangle extends Shape implements Calculator{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
