package Recrusion;

import java.util.Scanner;

public class Arrayprint {

    static void pra(int i, int a[], int n) {
        if (i < n) {
            System.out.print(a[i] + " ");
            pra(i + 1, a, n);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        pra(0, a, n);
        sc.close();
    }
}