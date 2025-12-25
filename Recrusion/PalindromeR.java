package Recrusion;

import java.util.Scanner;

public class PalindromeR {
    static int rev(int n, int r) {
        if (n == 0)
            return r;
        r = r * 10 + n % 10;
        return rev(n / 10, r);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int res = rev(n, r);
        sc.close();

        if (n == res)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
