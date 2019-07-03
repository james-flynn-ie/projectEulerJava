package p6SumSquareDifference;

/*
 * https://projecteuler.net/problem=6
 * The sum of the squares of the first ten natural numbers is,
 *       1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *      (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural
 *  numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        int sumofnums = 0; 
        int sumofsquares = 0;
        final int MAX_NUMBER = 10;

        for (int i = 1; i <= MAX_NUMBER; i++) { 
            sumofnums += i;    
            sumofsquares += i * i;     
        }
        System.out.println(sumofnums + " " + sumofsquares);
    }
 }