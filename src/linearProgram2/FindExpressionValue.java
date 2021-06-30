package linearProgram2;

import java.util.Scanner;

public class FindExpressionValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        double result = ((b+ (Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a))/2*a) -Math.pow(a,3)+Math.pow(b,-2);
        System.out.println(result);
    }
}
