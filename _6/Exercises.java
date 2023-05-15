package JavaAdvanced._6;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }
        for (Days printWeekDays : Days.values()) {
            System.out.println(printWeekDays);
        }
    }


    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        counterRange();
    }

    // Your code here
    enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER;
    }

    public static void counterRange() {
        Seasons currentSeason = Seasons.SPRING;
        String monthRange;

        switch (currentSeason) {
            case SPRING:
                monthRange = "Mar - May";
                break;
            case SUMMER:
                monthRange = "Jun - Aug";
                break;
            case FALL:
                monthRange = "Sep - Nov";
                break;
            case WINTER:
                monthRange = "Dec - Feb";
                break;
            default:
                monthRange = "Invalid season";
        }
        System.out.println("The current season is " + currentSeason + ", and the associated month range is " + monthRange + ".");
    }


    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {
            RED,
            YELLOW,
            GREEN;
        }

        TrafficLight currentLight = TrafficLight.GREEN;

        switch (currentLight) {
            case RED:
                System.out.println(TrafficLight.GREEN);
                break;
            case YELLOW:
                System.out.println(TrafficLight.RED);
                break;
            case GREEN:
                System.out.println(TrafficLight.YELLOW);
                break;
            default:
                System.out.println("The traffic light is broken");
        }
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        enum Days {
            MONDAY(false),
            TUESDAY(false),
            WEDNESDAY(false),
            THURSDAY(false),
            FRIDAY(false),
            SATURDAY(true),
            SUNDAY(true);
            private boolean isWeekend;

            Days(boolean isWeekend) {
                this.isWeekend = isWeekend;
            }

            public boolean getIsWeekend() {
                return isWeekend;
            }
        }

        Days currentDay = Days.TUESDAY;

        if (currentDay.getIsWeekend()) {
            System.out.println("weekend");
        } else {
            System.out.println("weekday");
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        operator();
    }

    enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }

    public static void operator() {
        Operator operazione = Operator.DIVIDE;
        double num1 = 5;
        double num2 = 2;

        switch (operazione) {
            case ADD:
                System.out.println(num1 + num2);
                break;
            case SUBTRACT:
                System.out.println(num1 - num2);
                break;
            case MULTIPLY:
                System.out.println(num1 * num2);
                break;
            case DIVIDE:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
