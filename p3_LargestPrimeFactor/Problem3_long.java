package p3_LargestPrimeFactor;

/** Question:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3_long {
    /**
     * Sieve of Erastothenes (retrieved from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
     * Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).
     * Initially, let p equal 2, the smallest prime number.
     * Enumerate the multiples of p by counting to n from 2p in increments of p, and mark them in the list (these will be 2p, 3p, 4p, ...; the p itself should not be marked).
     * Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.
     * When the algorithm terminates, the numbers remaining not marked in the list are all the primes below n.
     */
    public static void main (String[] args) {
        long numberUnderTest = 600_851_475_143L;
    }
}
