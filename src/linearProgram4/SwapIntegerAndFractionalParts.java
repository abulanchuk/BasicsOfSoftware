package linearProgram4;

import java.util.Scanner;

public class SwapIntegerAndFractionalParts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        int leftPart = (int) number;
        double rightPart = (number -leftPart)*1000;
        double result = ((double) leftPart/1000)+rightPart;
        System.out.printf("%.3f", result);
    }
}
