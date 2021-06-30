package branching2;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();
        int min1 = 0;
        int min2 = 0;
        int max = 0;
        if (a<b){
            min1 = a;
        }
        else{
            min1 = b;
        }
        if (c<d){
            min2 = c;
        }
        else{
            min1 = d;
        }
        if (min1>min2){
            max = min1;
        }
        else{
            max = min2;
        }
        System.out.println(max);
    }
}
