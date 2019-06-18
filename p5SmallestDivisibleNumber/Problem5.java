package p5SmallestDivisibleNumber;

/*
 * @author james-flynn-ie
 * https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    final static int MAX_NUMBER = 20;

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String[] args) {
        /* Since we are given in the question that smallest divisible number of 1 to 10 is 2520, 
         * and 10 is a factor of 20, we can start there!
         * 
         * We set the result to 2520, and then start checking the LCM from 10 to 20.
        */
        int result = 2520;
        for (int i = 10; i <= MAX_NUMBER; i++) {
            int currentGcd = gcd(i, result);
            result = result / currentGcd * i;
        }
        System.out.println(result);
    }
}