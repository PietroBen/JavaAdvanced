package JavaAdvanced.JavaInProduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args) {  // ho aggiunto il main qui per comodità ma forse la traccia chiedeva di
        exercise1();                          // creare una nuova classe main??
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random() * 100;
        String isGreater = (x >= 50) ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(isGreater);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person persona1 = new Person("Pietro",28, "via Roma 2");
        System.out.println(persona1);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("123456789987654323456789876543456789876543456789087654345678876543");
        System.out.println(bigInteger);
        bigInteger = bigInteger.divide(new BigInteger("3"));
        System.out.println(bigInteger);

        BigDecimal bigDecimal = new BigDecimal("0.000000000000000000000000314");
        System.out.println(bigDecimal);
        bigDecimal = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.HALF_UP);
        System.out.println(bigDecimal);
    }
}
