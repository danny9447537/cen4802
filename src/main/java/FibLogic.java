import java.util.Scanner;
/**
 * The FibLogic class handles the logic of the application. It prompts the user to enter a number, then calculates
 * and prints the corresponding Fibonacci sequence value for that number. The number must be a valid number,
 * otherwise the program will keep looping until a valid numkber is entered.
 *
 */
public class FibLogic {
    public void getUserInput() {
        while(true) {
            int usernum = 0;
            Scanner scnr =  new Scanner(System.in);
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

    public static long fibonacci(int usernum) {
        if (usernum <= 1) {
            return usernum;
        }
        return (fibonacci(usernum - 1) + fibonacci(usernum - 2));
    }
}
