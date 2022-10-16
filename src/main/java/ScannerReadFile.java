/* Java program to demonstrate
* usage of Scanner class
* to read from a file. */

// Importing required classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Main class.
public class ScannerReadFile
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
            throws FileNotFoundException
    {   // Start of execution thread.

        /* Creating an object
        * of Scanner class
        * to read from file. */
        Scanner fileRead
                = new Scanner
                (
                        new File
                        (
                            "C:\\FilesToBeRead\\longNumbers.txt"
                        )
                );

        /* Using while loop
        * to access elements
        * of Scanner object. */
        while (fileRead.hasNextLong())
        {   // Start of while loop block.

            // Printing elements of Scanner object.
            System.out.println
                    (
                        fileRead.nextLong()
                    );
        }   // End of while loop block.

    }   // End of execution thread.

}   // End of main class block.
