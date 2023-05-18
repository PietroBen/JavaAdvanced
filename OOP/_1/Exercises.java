package JavaAdvanced.OOP._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog cane1 = new Dog(0.45,9.00, "Bulldog");

        System.out.println("The "+cane1.getBreed()+" is tall "+cane1.getHeight()+"m and heavy "+cane1.getWeight()+"Kg");
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish pesce1 = new Fish(0.25,0.40, "Salmon");

        System.out.println("The "+pesce1.getSpecies()+" is tall "+pesce1.getHeight()+"m and heavy "+pesce1.getWeight()+"Kg");

        Bird uccello1 = new Bird(0.85,0.70, 8.89, "Tucan");

        System.out.println("The "+uccello1.getBreed()+" is tall "+uccello1.getHeight()+"m and heavy "+uccello1.getWeight()+"Kg");

    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog1 = new Dog(1.05, 79.3, "Alano");
        Fish fish1 = new Fish(0.15, 0.14, "Trota");
        Bird bird1 = new Bird(8.9, 4.00, 8.89 ,"Colibrì");

        System.out.println("The "+dog1.getBreed()+" run at "+ Dog.runSpeedMetersPerSecond() + "km/s");
        System.out.println("The "+fish1.getSpecies()+" run at " + Fish.swimSpeedMetersPerSecond() + "km/s");
        System.out.println("The "+bird1.getBreed()+" run at " + Bird.flySpeedMetersPerSecond() + "km/s");

        if (Dog.runSpeedMetersPerSecond() > Fish.swimSpeedMetersPerSecond() && Dog.runSpeedMetersPerSecond() > Bird.flySpeedMetersPerSecond()) {
            System.out.println("The dog has the fastest movement speed in MetersPerSecond");
        } else if (Fish.swimSpeedMetersPerSecond() > Dog.runSpeedMetersPerSecond() && Fish.swimSpeedMetersPerSecond() > Bird.flySpeedMetersPerSecond()) {
            System.out.println("The fish has the fastest movement speed in MetersPerSecond");
        } else if (Bird.flySpeedMetersPerSecond() > Dog.runSpeedMetersPerSecond() && Bird.flySpeedMetersPerSecond() > Fish.swimSpeedMetersPerSecond()) {
            System.out.println("The bird has the fastest movement speed in MetersPerSecond");
        }
    }
}

