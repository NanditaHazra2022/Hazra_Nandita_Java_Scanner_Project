# Hazra_Nandita_Java_Scanner_Project
This is a repository of Java programs to demonstrate use of in-built Scanner class.

The Scanner class belongs to the package: java.util (package of utility classes).
  public final class Scanner
  extends Object
  implements Iterator<String>, Closeable, AutoCloseable
A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens are then converted into values of different types using the various next methods.
For example, this code allows a user to read a number from System.in:
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     
Apart from taking inputs from console , this code can read from file. For example:
      Scanner read 
= new Scanner
 (
     new File
     (
          "C:\\myNumbers.txt"
     )
 );
      while (read.hasNextLong()) 
      {
          long number = read.nextLong();
      }

The scanner can also use delimiters other than whitespace.
The next() and hasNext() methods and their primitive-type companion methods (such as nextInt() and hasNextInt()) first skip any input that matches the delimiter pattern, and then attempt to return the next token.
The findInLine(java.lang.String), findWithinHorizon(java.lang.String, int), and skip(java.util.regex.Pattern) methods operate independently of the delimiter pattern. These methods will attempt to match the specified pattern with no regard to delimiters in the input and thus can be used in special circumstances where delimiters are not relevant.
Depending upon the type of delimiting pattern, empty tokens may be returned. For example, the pattern "\\s+" will return no empty tokens since it matches multiple instances of the delimiter. The delimiting pattern "\\s" could return empty tokens since it only passes one space at a time.
A scanner can read text from any object which implements the Readable interface. If an invocation of the underlying Readable interface method: read(java.nio.CharBuffer) method throws an IOException then the scanner assumes that the end of the input has been reached. The most recent IOException thrown by the underlying readable can be retrieved via the ioException() method.
When a Scanner is closed using the method: close(), it will close its input source if the source implements the Closeable interface.
A Scanner is not safe for multithreaded use without external synchronization.
Unless otherwise mentioned, passing a null parameter into any method of a Scanner will cause a NullPointerException to be thrown.




