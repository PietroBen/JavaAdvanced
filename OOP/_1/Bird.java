package JavaAdvanced.OOP._1;

public class Bird extends Animal {

    private static double wingSpan;

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public static double flySpeedMetersPerSecond() {
        double speedBird = wingSpan * 4;
        return speedBird;
    }
}