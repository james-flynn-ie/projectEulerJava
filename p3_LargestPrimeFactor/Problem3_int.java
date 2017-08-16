package p3_LargestPrimeFactor;

import java.util.concurrent.CopyOnWriteArrayList;

/** Question:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3_int {

    /**
     * This approach works for ints such as 13195, but is not efficient for long integrals.
     * A more efficient approach is defined in https://github.com/james-flynn-ie/projectEulerJava/blob/master/p3_LargestPrimeFactor/Problem3_long.java
     */

    public static void main(String[] args) {
        int numberUnderTest = 13_195;
        // CopyOnWriteArrayList<> allows us to modify an array list while iterating through it.
        CopyOnWriteArrayList<Integer> allFactors = new CopyOnWriteArrayList<>();

        // Get list of all factors, whether they are prime or not.
        for (int i = 2; i <= numberUnderTest; i++) {
            if (numberUnderTest % i == 0) {
                allFactors.add(i);
            }
        }

        // Check if any factors can be divided by another factor, i.e.: are not prime.
        for (int i = 0; i < allFactors.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (! allFactors.get(i).equals(allFactors.get(j)) && (allFactors.get(i) % allFactors.get(j) == 0)) {
                    allFactors.remove(i);
                    // Decrement 'i' so that we don't miss one of the factors after the post-removal reindexing.
                    i--;
                }
            }
        }

        System.out.println("The prime factors for " + numberUnderTest + " are : " + allFactors);
    }
}
