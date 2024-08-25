import java.util.Scanner;
/**
 * The Main class a simple application that calculates the Fibonacci sequence for a given number entered by the
 * user. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones,
 * usually starting with 0 and 1.
 */
public class Main {
    /**
     * The main method is the entry point of the application. It prompts the user to enter a number, then calculates
     * and prints the corresponding Fibonacci sequence value for that number. The number must be a valid number,
     * otherwise the program will keep looping until a valid numkber is entered.
     *
     * @param args In this application, while args is the parameter for the main method, it is not
     *             actually used.
     */

    public static void main(String[] args) {
        int usernum = 0;
        Scanner scnr =  new Scanner(System.in);

        while (true) {
        System.out.println("Enter a number for the fibonacci sequence (Must be a non-negative integer): ");
            if (scnr.hasNextInt()) {
                usernum = scnr.nextInt();
                if (usernum >= 0) {
                  System.out.println("The " + usernum + "th term in the Fibonacci sequence is: " + fibonacci(usernum) );
                  break;
                }
                else {
                    System.out.println("Your Fibonacci sequence is incorrect.");
                }
            }
            else {
                System.out.println("Your Fibonacci sequence is incorrect.");
                scnr.next();
            }
        }
    }
    /**
     * This method calculates the Fibonacci sequence value for a given number.
     * The Fibonacci sequence is defined as:
     * f(n) = f(n - 1) + f(n - 2)
     *
     * @param usernum The position in the Fibonacci sequence to calculate. It must be a non-negative integer.
     * @return The Fibonacci sequence value corresponding to the given position.
     */

    private static long fibonacci(int usernum) {
        if (usernum <= 1) {
            return usernum;
        }
        return (fibonacci(usernum - 1) + fibonacci(usernum - 2));
    }
}