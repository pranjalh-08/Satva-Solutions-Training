// Define an enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Main class to demonstrate enum usage
public class Enum {
    public static void main(String[] args) {
        // Using an enum value
        Day today = Day.WEDNESDAY;

        // Printing the enum value
        System.out.println("Today is: " + today);

        // Using enums in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }

        // Loop through all enum values
        System.out.println("\nAll days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
