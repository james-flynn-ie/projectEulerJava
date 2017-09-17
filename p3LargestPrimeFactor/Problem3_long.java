package p3LargestPrimeFactor;

/** Question:
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
        long numberUnderTest=600_851_475_143L;

        for (long i = 2L; i <= numberUnderTest; i++) {
            // A prime factor must be >= 2 & mod = 0
            if (numberUnderTest % i==0) {
                System.out.println(i);

                // Divide by factor, then reset i to 2 and loop through again.
                numberUnderTest = numberUnderTest / i;
                i = 2L;
            }
        }
    }
}
