package linearProgram6;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        boolean result = false;
        if ((x<5 && x>-5) && (y<1 && y>-4)){
            result = true;
        }
        if (x<3 && x>-3 && y>-1 && y<5){
            result = true;
        }
        System.out.println(result);
    }

}
