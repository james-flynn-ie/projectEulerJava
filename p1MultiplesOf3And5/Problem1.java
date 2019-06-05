package p1MultiplesOf3And5;

/**
 * @author james-flynn-ie
 * @url https://projecteuler.net/problem=1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    private static int getSumOfMultiples(int maxCount, int count, int sum) {
        while (count < maxCount) {
            if (count % 3 == 0 || count % 5 == 0 ) {
                sum += count;
            }
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int maxCount = 1_000;
        int count = 3;
        int sum = 0;

        int totalSum = getSumOfMultiples(maxCount, count, sum);

        System.out.println("Total Sum of all the multiples of 3 or 5 below 1000 is " + totalSum);
    }
}
