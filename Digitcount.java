import java.util.Scanner;

public class Digitcount {
    static int digitCount(int num, int count) {
        if (num == 0) {
            return count;
        }
        return digitCount(num / 10, ++count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int ans = digitCount(n, c);
        System.out.println(ans);
        sc.close();
    }
}
