package branching5;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
double result =0;
        int x = in.nextInt();
        if (x<=3){
           result = Math.pow(x,2)-3*x+9;
        }
        else{
          result =   1/(Math.pow(x,3)+6);
        }
        System.out.println(result);
    }
}
