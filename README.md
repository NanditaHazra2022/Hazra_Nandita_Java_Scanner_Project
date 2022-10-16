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





