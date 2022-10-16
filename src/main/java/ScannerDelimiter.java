import java.util.Scanner;

public class ScannerDelimiter
{

    public static void main(String[] args)
    {

        String input = "1 mango 2 mango green mango yellow mango";
        Scanner s = new Scanner(input).useDelimiter("\\s*mango\\s*");
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();

    }

}
