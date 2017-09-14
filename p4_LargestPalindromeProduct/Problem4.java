package p4_LargestPalindromeProduct;

public class Problem4 {
    /**
     * @author james-flynn-ie
     *
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int result = i * j;
                System.out.println("(" + i + ") *  (" + j + ") = " + result);

                //Convert result to String before reversing.
                String strResult = Integer.toString(result);
                String reverseResult = new StringBuffer(strResult).reverse().toString();

                //System.out.println("Result: " + result);
                //System.out.println("Reversed: " + reverseResult);

                if ((reverseResult).equals(Integer.toString(result))) {
                    System.out.println("Palindrome found! " + result);

                    if (result > largestPalindrome) {
                        largestPalindrome = result;
                    }
                }
            }
        }
        System.out.println("The largest palindrome from 2 three-digit numbers is " + largestPalindrome);
    }
}
