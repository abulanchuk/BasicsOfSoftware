package cycle2;

import java.util.Scanner;

public class SystemAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h =in.nextDouble();

        for (double i=a; i<=b; i = i+h){
            if(i>2){
                System.out.println(i);
            }
            else {
                System.out.println(-i);
            }
        }
    }
}
