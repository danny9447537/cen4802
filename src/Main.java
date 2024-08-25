import java.util.Scanner;

public class Main {
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
    private static long fibonacci(int usernum) {
        if (usernum <= 1) {
            return usernum;
        }
        return (fibonacci(usernum - 1) + fibonacci(usernum - 2));
    }
}