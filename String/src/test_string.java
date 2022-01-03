import java.util.Scanner;
public class test_string
{
    public static void main(String[] args)
    {
       Scanner se= new Scanner(System.in);
        int num = get_num(a32bcd20zx3);

    }
    public int get_num (String s)
    {
        String str= s.trim();
        String digits= " ";

        for (int i=0; i< s.length(); i++)
        {
            char ch= str.charAt(i);
            if (Character.isDigit(ch))
            {
                digits= digits + ch;
            }
            int b = Integer.parseInt(digits);
            return b;

        }
        return 0;
    }
}