package JavaAdvanced.JavaInProduction._2;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }


    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
        ourNumbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println); //  .forEach(x -> System.out.println(x));
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
        Set<Integer> oddNumbers = ourNumbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toSet());
        System.out.println(oddNumbers);

    }


    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here
        Set<String> uppercaseSet = alice
                .stream().map(String::toUpperCase)  // .stream().map(String -> String.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(uppercaseSet);
    }

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
        Set<Integer> evenNumbersSet = ourNumbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toSet());
        System.out.println(evenNumbersSet);
    }
}
