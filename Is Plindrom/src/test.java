import java.util.*;
public class test
{
    static boolean testIsPalindrom (String str, int a, int b)
    {
        if(a==b)
        {
            return true;
        }
        if(str.charAt(a) != str.charAt(b))
        {
            return false;
        }
        if(a < b+1)
        testIsPalindrom(str , a+1 , b -1);
        return true;
    }

    static boolean isPlindrom(String str)
    {
        int n = str.length();
        if (n ==0 )
            return false;
     return   testIsPalindrom(str , 0 , n -1);
    }

    public static void main (String[]args)
    {
        Scanner se =new Scanner(System.in);
        System.out.println("enter the string");
        String str = se.nextLine();
        if(isPlindrom((str)
        {
            System.out.println("is Plindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }
    }
}



    
