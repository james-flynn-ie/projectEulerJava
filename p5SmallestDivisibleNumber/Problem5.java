package p5SmallestDivisibleNumber;

/*
 * @author james-flynn-ie
 * https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    final static int MAX_NUMBER = 20;

    /* The Greatest Common Factor (GCF) is the largest positive integer 
     * that divides evenly into the numbers a and b with no remainder.
     * 
     * We could also have used prime factorisation to calculate the LCM, 
     * but I used this approach since we already used that in Problem 3.
     */
    static int gcf(int a, int b) {
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
         * We set the result to 2520, and then start calculating from 10 to 20.
        */
        int result = 2520;

        /* Our result is the Lowest Common Multiple (LCM), which can be defined as:
         * "For two integers a and b, denoted LCM(a,b), the LCM is the smallest integer that is evenly divisible by both a and b"
         *      https://www.calculatorsoup.com/calculators/math/lcm.php
         */
        for (int i = 10; i <= MAX_NUMBER; i++) {
            int currentGcf = gcf(i, result);
            result = result / currentGcf * i;
        }
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + result);
    }
}