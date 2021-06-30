package cycle8;

import java.util.Scanner;

public class GeneralDigitsInTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int digit1 = 0;
        int digit2 = 0;
        int k = number2;
        while (number1 > 0) {
            digit1 = number1 % 10;
            number1 = number1 / 10;
            number2 = k;
            while (number2 > 0) {
                digit2 = number2 % 10;
                number2 = number2 / 10;
                if (digit1 == digit2) {
                    System.out.println(digit1);
                    break;
                }
            }

        }


    }
}
