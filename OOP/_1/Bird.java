package JavaAdvanced.OOP._1;

public class Bird extends Animal {

    private static double wingSpan;
    private String breed;

    public Bird(double height, double weight, double wingSpan, String breed) {
        super(height, weight);
        this.wingSpan = wingSpan;
        this.breed = breed;
    }

    public Bird(double height, double weight) {
        super(height, weight);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static double flySpeedMetersPerSecond() {
        double speedBird = wingSpan * 4;
        return speedBird;
    }
}