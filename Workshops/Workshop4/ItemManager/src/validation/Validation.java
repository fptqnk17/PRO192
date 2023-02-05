package validation;

import java.util.Scanner;

public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        int value = Integer.MIN_VALUE;

        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter again");
            }

            if (value >= min && value <= max) {
                break;
            }
        }

        return value;
    }
    
    public static boolean getBoolean() {
        boolean value = false;
        
        while (true) {
            try {
                value = Boolean.parseBoolean(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter again");
            }
        }
        
        return value;
    }
}
