package cycle5;

import java.util.Scanner;

public class ModuloNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e = in.nextDouble();
        double sum = 0;

        double current = e + 1;
        int i = 1;

        while (current >= e) {
            current = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            i++;
            if (current >= e) {
                sum += current;
            }
        }

        System.out.println(sum);
        //for (int i = 1; i <= e; i++) {
        //    double count = 0;
        //    count = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
        //    if (e <= Math.abs(count)){
        //        sum+=count;
        //    }
       // }
    }
}
