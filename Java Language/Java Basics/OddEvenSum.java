/*
 *  Sum the off numbers and the even numbers from a lowerbound to an upperbound
 */
public class OddEvenSum {   // Save as "OddEvenSum.java"
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sumOdd = 0;     // For accumulating odd numbers init to 0
        int sumEven = 0;    // For accumulating even numbers, ini to 0
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
          if (number % 2 == 0){      // Even
            sumEven += number;       // Add current number to sum of evens
          }  else {
            sumOdd += number;         // Add current number to sum of odds
          }
          ++number;     // Next number
        }
        // Print the result
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
        System.out.println("The difference between the two sum is " + (sumOdd - sumEven));
    }
}