package p5SmallestDivisibleNumber;

public class Problem5 {
    final static int MAX_NUMBER = 10;

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            int currentGcd = gcd(i, result);
            result = result / currentGcd * i;
        }
        System.out.println(result);
    }
}