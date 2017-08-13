package projectEulerJava;

/**
 *
 * @author james-flynn-ie
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    private static int getSumOfMultiples(int maxCount, int count, int sum) {
        do {
            System.out.println("count: " + count);
        
            if (count % 3 == 0 || count % 5 == 0 ) {
                sum += count;
            }
        
            System.out.println("Running total: " + sum);
            count++;
        } while (count < maxCount);
        
        return sum;
    }
        
    public static void main(String[] args) {
        int maxCount = 1000;
        int count = 0;
        int sum = 0;
        
        int totalSum;
        totalSum = getSumOfMultiples(maxCount, count, sum);
        
        System.out.println(totalSum);
    }    
}
