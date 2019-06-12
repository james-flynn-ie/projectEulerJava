package p4LargestPalindromeProduct;

public class Problem4 {
    /**
     * @author james-flynn-ie
     * @url https://projecteuler.net/problem=4
     * A palindromic number reads the same both ways.
     * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    static int findLargestPalindrome(int result, String reverseResult, String strResult, int largestPalindrome) {
        if ((reverseResult).equals(strResult)) {
            System.out.println("Palindrome found! " + result);
            
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

                //Convert result to String before reversing.
                String strResult = Integer.toString(result);
                String reverseResult = new StringBuffer(strResult).reverse().toString();

                largestPalindrome = findLargestPalindrome(result, strResult, reverseResult, largestPalindrome);
            }
        }

        System.out.println("The largest palindrome from 2 three-digit numbers is: " + largestPalindrome);
    }
}
