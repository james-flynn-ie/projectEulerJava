package p3LargestPrimeFactor;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author james-flynn-ie
 * @url https://projecteuler.net/problem=3
 * Question:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3_int {
    /**
     * This approach works for ints such as 13195, but is not efficient for long integrals.
     * A more efficient approach is defined in https://github.com/james-flynn-ie/projectEulerJava/blob/master/p3_LargestPrimeFactor/Problem3_long.java
     */
    private static CopyOnWriteArrayList<Integer> getAllFactors (int numberUnderTest, CopyOnWriteArrayList<Integer> allFactors) {
        for (int i = 2; i <= numberUnderTest; i++) {
            if (numberUnderTest % i == 0) {
                allFactors.add(i);
            }
        }
        return allFactors;
    }

    static int removePrimeFromFactor (CopyOnWriteArrayList<Integer> allFactors, int i, int j) {
        if (! allFactors.get(i).equals(allFactors.get(j)) && (allFactors.get(i) % allFactors.get(j) == 0)) {
            allFactors.remove(i);
            // Decrement 'i' so that we don't miss one of the factors after the post-removal reindexing in for-loop.
            i--;
        }
        return i;
    }

    private static CopyOnWriteArrayList<Integer> removePrimesFromAllFactors (CopyOnWriteArrayList<Integer> allFactors) {
        for (int i = 0; i < allFactors.size(); i++) {
            // We need to also check if i < allFactors array inside the j-loop.
            for (int j = 0; j <= i && i < allFactors.size(); j++) {
                removePrimeFromFactor(allFactors, i, j);
            }
        }
        return allFactors;
    }

    public static void main(String[] args) {
        int numberUnderTest = 13_195;

        // CopyOnWriteArrayList<> allows us to modify an array list while iterating through it.
        CopyOnWriteArrayList<Integer> allFactors = new CopyOnWriteArrayList<>();

        // Get list of all factors, whether they are prime or not.
        allFactors = getAllFactors(numberUnderTest, allFactors);

        // Check if any factors can be divided by another factor, i.e.: are not prime.
        allFactors = removePrimesFromAllFactors(allFactors);

        System.out.println("Warning: This approach is inefficient for long numbers.\n" +
                        "Please use the Problem3_long.java solution for numbers larger than an int.\n");
        System.out.println("The prime factors for " + numberUnderTest + " are : " + allFactors);
    }
}
