/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */

public class RunningNumberSum {     // Save as "RunningNumberSum.java"
    public static void main(String[] args) {
        final int LOWERBOUND = 1;       // Store the lowerbound
        final int UPPERBOUND = 1000;    // Store the upperbound
        int sum = 0;    // Declare an int variable "sum" to accumulate the number
                        // Set the initial sum to 0
        

        // Use a while-loop to repeatedly sum from the lowerbund to the upperbound
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+!, LOWERBOUND+2, ..., UPPERBOUND for each interation
            summ = sum + numbe;     // Accumulate numebr into sum
            ++number;               // increment number
        }
        // Print the result
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);

    }
}

// Exercises
/* 1. Modify the above program (called RunningNumber1) to sum all the numbers from 9 to 899. (Ans: 404514)
 * 2. Modify the above program (called RunningNumberOddSum) to sum all the odd numbers between 1 to 1000. (Hint: Change the post-processing statement to "number = number + 2". Ans: 250000)
 * 3. Modify the above program (called RunningNumberMod7Sum) to sum all the numbers between 1 to 1000 that are divisible by 7. (Hint: Modify the initialization statement to begin from 7 and post-processing statement to increment by 7. Ans: 71071)
 * 4. Modify the above program (called RunningNumberSquareSum) to find the sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +... (Hint: Modify the sum = sum + number statement. Ans: 338350)
 * 5. Modify the above program (called RunningNumberProduct) to compute the product of all the numbers from 1 to 10. (Hint: Use a variable called product instead of sum and initialize product to 1. Modify the sum = sum + number statement to do multiplication on variable product. Ans: 3628800)
 Hint: You will need to change the values of LOWERBOUND and UPPERBOUND in the RunningNumber1 class.*/