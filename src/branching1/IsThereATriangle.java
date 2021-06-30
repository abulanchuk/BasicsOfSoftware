package branching1;

import java.util.Scanner;

public class IsThereATriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angle1 = in.nextInt();
        int angle2 = in.nextInt();
        boolean isThere = false;
       // int angle3 = 180 - angle1 - angle2;

        //if ((angle1 < angle2 + angle3) && (angle2 < angle1 + angle3) && (angle3 < angle1 + angle2)) {
        if(angle1+angle2<180){
            isThere = true;
        if (angle1 + angle2 == 90 || angle1 == 90 || angle2 == 90) {
            System.out.println("with 90 degree");
        }

    }
        System.out.println(isThere);
}
}
