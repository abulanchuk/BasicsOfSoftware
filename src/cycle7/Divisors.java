package cycle7;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i = m; i < n; i++) {
            System.out.println(i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(" ("+j+")");
                }
            }
        }
    }
}
