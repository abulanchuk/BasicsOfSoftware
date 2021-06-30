package cycle4;

public class MultiplicationOfSquares {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i <= 200; i++) {
            result *= Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
