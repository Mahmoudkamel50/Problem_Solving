import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,k;
        int n,temp=0;

        n= input.nextInt();

        int a[]= new int[n];
        for(i=0;i<n;i++)
            System.out.println(a[i]);

        Arrays.sort(new int[][]{new int[]{a.length}},
                a.length+ n);

        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                System.out.println(a[i]);
                temp=1;
                break;
            }
        }

        if(temp==0)
            System.out.println("NO");


     }

    }