package JavaAdvanced.OOP._1;

public class Dog extends Animal{
     private String breed;

    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }
    public Dog(double height, double weight) {
        super(height, weight);
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static double runSpeedMetersPerSecond(){
        double speedDog = getHeight() * 2;
        return speedDog;
    }
}
