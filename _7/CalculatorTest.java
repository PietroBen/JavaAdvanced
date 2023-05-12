package JavaAdvanced._7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator=new Calculator();
        Assertions.assertEquals(10,calculator.add(5,5));
        Assertions.assertEquals(-5,calculator.subtract(10,15));
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(25,calculator.multiply(5,5));
        Assertions.assertEquals(10,calculator.divide(100,10));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)); // prova
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator= new Calculator();
        //corretto il calcolatore = invertiti base ed esponente nella formula)
        //base positive
        Assertions.assertEquals(100,calculator.power(10,2));
        //base negative
        Assertions.assertEquals(100,calculator.power(-10,2));
        // base zero
        Assertions.assertEquals(0,calculator.power(0,2));
        //decimals
        Assertions.assertEquals(2500.00,calculator.power(50,2));
        // exponent 0
        Assertions.assertEquals(1,calculator.power(34567,0));
        // exponent 1
        Assertions.assertEquals(0,calculator.power(0,1));


    }
}