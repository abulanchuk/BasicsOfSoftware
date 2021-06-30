package linearProgram5;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int hh = t/3600;
        int mm =(t-(hh*3600))/60;
        int sec= t-mm*60-hh*3600;
        System.out.print(hh+"ч "+mm+" мин "+sec+" сек");
    }
}
