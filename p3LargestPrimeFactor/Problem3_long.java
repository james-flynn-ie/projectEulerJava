package p3LargestPrimeFactor;

/**
 * @author james-flynn-ie
 * @url https://projecteuler.net/problem=3
 * Question:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3_long {
    /**
     * http://www.onlinemathlearning.com/prime-factors.html
     *
     * Prime factorization by repetitive division:
     *  Divide the number by the lowest prime number.
     *  Repeat division until numberUnderTest = 1 (which cannot be prime).
     */
    public static void main(String[] args) {
        final long ORIGINAL_NUMBER_UNDER_TEST =600_851_475_143L;
        long numberUnderTest=ORIGINAL_NUMBER_UNDER_TEST;

        for (long i = 2L; i < numberUnderTest; i++) {
            // Keep dividing numberUnderTest by incremental i, until it can't be divided by i any longer.
            if (numberUnderTest % i==0 && i != 1) {
                // Divide by factor, before looping again.
                numberUnderTest = numberUnderTest / i;
            }
        }
        System.out.println("The largest prime factor of " + ORIGINAL_NUMBER_UNDER_TEST + " is: " + numberUnderTest);
    }
}
