/* Java program to demonstrate
* delimiting text
* by use of Scanner
* and MatchResult class. */

// Importing required classes.
import java.util.Scanner;
import java.util.regex.MatchResult;

// Main class.
public class ScannerMatchResult
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating an object of String class.
        String text = "1 mango 2 mango green mango yellow mango";

        // Creating an object of Scanner class.
        Scanner s = new Scanner(text);

        /* findInLine method
        * of Scanner class
        * is used to match the specified pattern
        * with no regard to delimiters in the input. */
        s.findInLine("(\\d+) mango (\\d+) mango (\\w+) mango (\\w+)");

        /* Creating an object
        * of MatchResult class
        * using match method
        * of Scanner class.
        *  */
        MatchResult result = s.match();
        for (int i=1;
             i<=result.groupCount();
             i++)
        {
            System.out.println(result.group(i));
        }

        // Closing this scanner.
        s.close();

    }   // End of execution thread.

}   // End of main class.
