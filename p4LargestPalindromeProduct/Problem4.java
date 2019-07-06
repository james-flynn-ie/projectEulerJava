package p4LargestPalindromeProduct;

public class Problem4 {
    /**
     * @author james-flynn-ie
     * @see <a href="https://projecteuler.net/problem=4">https://projecteuler.net/problem=4</a>
     * A palindromic number reads the same both ways.
     * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    static int findLargestPalindrome(int result, int largestPalindrome) {
        //Convert result to String and then reverse it.
        String strResult = Integer.toString(result);
        String reverseResult = new StringBuffer(strResult).reverse().toString();

        if (reverseResult.equals(strResult)) {

            // Uncomment the next line to see the full palindrome list:
            // System.out.println("Palindrome found! " + result);

            if (result > largestPalindrome) {
                largestPalindrome = result;
            }
        }
        
        return largestPalindrome;
    }
    
    public static void main(String[] args) {        
        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int result = i * j;

                // Uncomment this println to see the output of each loop. Beware, it is verbose!
                //System.out.println("(" + i + ") * (" + j + ") = " + result);

                largestPalindrome = findLargestPalindrome(result, largestPalindrome);
            }
        }

        System.out.println("The largest palindrome from 2 three-digit numbers is: " + largestPalindrome);
    }
}
