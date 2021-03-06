package src.main.java.com.github.james_flynn_ie.projecteulerjava.p2evenfibonaccinumbers;

/**
 * @author james-flynn-ie
 * @see <a href="https://projecteuler.net/problem=2">https://projecteuler.net/problem=2</a>
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {

    private static long findSumEvenTerms (long nextTerm, long sum) {
        if (nextTerm % 2 == 0) {
            sum += nextTerm;
        }

        return sum;
    }

    private static long findNextTerm (int maxTerm, long termOne, long termTwo) {
        //Set sum to 2, as we already declared the first even term as termTwo.
        long sum = 2L;
        
        while (termTwo <= maxTerm) {
            long nextTerm = termOne + termTwo;

            // Uncomment this println to see all the Fibonacci numbers > 2.
            //System.out.println(nextTerm);

            // If nextTerm is even, then add to sum
            sum = findSumEvenTerms(nextTerm, sum);

            // Set the terms for the next Fibonacci
            termOne = termTwo;
            termTwo = nextTerm;
        }

        return sum;
    }

    public static void main (String[] args) {
        int maxTerm = 4_000_000;

        long termOne = 1L;
        long termTwo = 2L;

        long sumEvenTerms = findNextTerm(maxTerm, termOne, termTwo);

        System.out.println("Total sum of even Fibonacci terms where the Fibonacci numbers are less than 4000000 is " + sumEvenTerms);
    }
}
