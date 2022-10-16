/* Java program to demonstrate
* taking input from console
* using Scanner class. */

// Importing required class.
import java.util.Scanner;

// Main class.
public class ScannerConsoleInput
{   // Start of main class block.

    // Starting point of execution.
    public static void main(String[] args)
    {   //Start of execution thread block.

        // try-catch block for exception handling.
        try
        {   // Start of try block.

            /* Creating an object
            * of Scanner class
            * to take console input. */
            Scanner input = new Scanner(System.in);

            // Taking input from console.
            System.out.println
                    (
                            "Input an integer positive number-> "
                    );
            int num = input.nextInt();  // Assigning console input to an integer variable.

            /* The text can be printed
             * only when the console input
             * integer number is a positive number.
             * Using if-else condition to keep a check.  */
            if (num > 0)
            {   // Start of if condition block.

                /* Printing text on console
                 * repeatedly as many times
                 * as the console input
                 * integer number
                 * using for loop. */
                for
                (
                        int i = 1;
                        i <= num;
                        i++
                )
                {   // Start of for loop block.
                    System.out.println
                            (
                                    "Hello World!!" // Text to be printed on console.
                            );
                }   // End of for loop block.

            }   // End of if condition block.
            else
            {   // Start of else condition block.
                System.out.println
                        (
                                "Input number is not positive, hence cannot print text."
                        );
            }   // End of else condition block.

        }   // End of try block.
        catch (Exception e)
        {   // Start of catch block.
            System.err.println
                    (
                            "Caught InputMisMatchException"   // Error message that will be printed on console.
                    );
        }   // End of catch block.

    }   // End of execution thread block.

}   // End of main class block.
