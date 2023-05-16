package JavaAdvanced.OOP._2;

public class Circle extends Shape implements Calculator{
    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
