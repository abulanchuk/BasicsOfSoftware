package branching4;

import java.util.Scanner;

public class Brick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("enter shape");
        int x= in.nextInt();
        int y= in.nextInt();
        int z= in.nextInt();

        if ((((a>=x) && (b>=y)) ||((a>=y) && (b>=x)))|| ((a>=x) && (b>=z))||((a>=z) && (b>=x)) || ((a>=z) && (b>=y))||((a>=z) && (b>=z))){
            System.out.println("ok");
        }
        else {
            System.out.println("not");
        }

    }
}
