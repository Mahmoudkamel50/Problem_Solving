import java.util.*;
import java.lang.*;
import java.io.*;


public class Floyed {

    void floyd(int n, int w[][], int d[][], int p[][]) {
        int i, j, k;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                p[i][j] = 0;
        w = d;
        for (k = 0; k < n; k++) {

            for (i = 0; i < n; i++) {

                for (j = 0; j < n; j++) {
                    if (p[i][k] + p[k][j] < p[i][j])
                        p[i][j] = k;
                        p[i][j] = p[i][k] + p[k][j];


                }
            }
        }
    }

    void path(int q, int r) {
        int p[][] = new int[q][r];
        if (p[q][r] != 0) {
            path(q, p[q][r]);
            System.out.println(p[q][r]);
            path(p[q][r], r);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = sc.nextInt();
            }
        }

    }
}


