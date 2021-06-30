package branching3;

import java.util.Scanner;

public class StraightLineWithDots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter  dot 1");
        float x1 = in.nextInt();
        float y1 = in.nextInt();
        System.out.println("enter  dot 2");
        float x2 = in.nextInt();
        float y2 = in.nextInt();
        System.out.println("enter  dot 3");
        float x3 = in.nextInt();
        float y3 = in.nextInt();

        if (x1==x2&&x2==x3){
            System.out.println("true");
            return;
        }

        float k = (y1 - y2) / (x1 - x2);
        float b = y1 - k * x1;
        float f3 = k * x3 + b;
        if (f3 == y3) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
