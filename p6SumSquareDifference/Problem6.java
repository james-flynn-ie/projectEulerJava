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
        final int MAX_NUMBER = 100;

        int sumofnums = 0;
        int sumofsquares = 0;
        int squaredsum = 0;

        for (int i = 1; i <= MAX_NUMBER; i++) { 
            sumofnums += i;    
            sumofsquares += Math.pow(i, 2);     
        }

        squaredsum = (int) Math.pow(sumofnums, 2);
        System.out.println("The squared sum of the squares of the first " + MAX_NUMBER + " natural numbers is: " + squaredsum);
        System.out.println("The sum of the squares of the first " + MAX_NUMBER + " natural numbers is: " + sumofsquares);

        int difference = squaredsum - sumofsquares;
        System.out.println("The difference between the sum of the squares and the square of the sum for the first " + MAX_NUMBER + " natural numbers is: " + difference);
    }
 }