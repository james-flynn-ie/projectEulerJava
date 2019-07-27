package src.main.java.com.github.james_flynn_ie.projecteulerjava.p7tenthousandandfirstprimenumber;

/**
 * @author james-flynn-ie
 * @see <a href="https://projecteuler.net/problem=7">https://projecteuler.net/problem=7</a>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 {
    static final int MAX_PRIME_NUMBER = 10001;

    // returns the nth prime number
    public static long nthPrime(long n) {
        int primesFound = 0;
        long numberUnderTest = 1;
        
        while (primesFound < n) {
            numberUnderTest++;
            if (isPrime(numberUnderTest)) {
                primesFound++;
            }
        }
        return numberUnderTest;
    }
    
    // returns true if parameter n is a prime number, false if composite or neither
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The " + MAX_PRIME_NUMBER + " prime number is: " + nthPrime(MAX_PRIME_NUMBER));
    }
}