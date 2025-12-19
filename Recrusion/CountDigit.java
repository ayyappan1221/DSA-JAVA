package Recrusion;

import java.util.Scanner;

public class CountDigit {
    static int cnd(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + cnd(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = cnd(n);
        System.out.println("Number of digits: " + count);
        sc.close();
    }

}
