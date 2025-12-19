package Recrusion;

import java.util.Scanner;

public class Lopping {
    static void lop(int i, int n) {
        if (i <= n) {
            System.out.print(i + " ");
            lop(++i, n);
        }
        return;
    }

    static void loprev(int i, int n) {
        if (n >= i) {
            System.out.print(n + " ");
            loprev(i, --n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        lop(0, n);
        System.out.println();
        loprev(0, n);
        sc.close();
    }
}