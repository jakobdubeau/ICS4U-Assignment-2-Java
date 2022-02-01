/*
*
* The Run program.
*
*
* @author Jakob
* @version 1.0
* @since 2020-12-15
*/

import java.util.Scanner;

/**
* Run program.
*/
public final class Run {

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Run() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String input;

        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        if (input.matches(".*\\d.*")) {
            System.out.println("Not a valid string.");
        }
        else if ("".equals(input)) {
            System.out.println("The max run is: 0");
        }
        else {
            System.out.println("The max run is: " + maxRun(input));
        }
    }

    /**
    * MaxRun.
    *
    * @param str String
    * @return return
    */

    static int maxRun(final String str) {
        int largestRun = 1;
        int temp = 1;

        for (int string = 1; string < str.length(); string++) {
            if (str.charAt(string) == str.charAt(string - 1)) {
                ++temp;
            }
            else {
                largestRun = Math.max(largestRun, temp);
                temp = 1;
            }
        }

        largestRun = Math.max(largestRun, temp);

        return largestRun;
    }
}

