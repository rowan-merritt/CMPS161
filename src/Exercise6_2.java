// CMPS 161
// Program Assignment 07
// Aubrey Merritt
// W#0749642


/*
Page 236
6.2 (Sum the digits in an integer) 
Write a method that computes the sum of the digits in an integer. 
   Use the following method header: 

      public static int sumDigits(long n)
   
   For example, sumDigits(234) returns 9 (2 + 3 + 4).

Hint:
Use the % operator to extract digits, and 
   use the / operator to remove the extracted digit. 
   For instance, to extract 4 from 234, use 234 % 10 (= 4). 
   To remove 4 from 234, use 234 / 10 (= 23). 
   Use a loop to repeatedly extract and remove the digit until 
      all the digits are extracted.
   Write a test program that 
      prompts the user to enter an integer and 
      displays the sum of all its digits.
*/

import java.util.Scanner;

public class Exercise6_2 {
	public static void main(String[] args) {
      // Enter a positive integer: Scanner(System.in)
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positve integer: ");
		long digit = input.nextLong();
		
      // Call method sumDigits and then display the result
		System.out.println("The sum of digits for " + digit + " is " + sumDigits(digit));
		// Note to self: sumDigits(digit) must be 9 because 2 + 3 + 4 = 9

	} // end of main

	public static int sumDigits(long n) {
		int temp = (int)Math.abs(n);	// temporary value
		int sum = 0;	// the sum of the digits

		// while (loop until all the digits are extracted) {
		while (temp != 0) {
			// extract a digit (%) and add the extracted digit into sum
			sum += (temp % 10);
		
			// remove the extracted digit (/)
			temp = temp / 10;
		// }
		}
		
		// return the sum of the digits
		return sum;
	}	// end of sumDigits
	
} // end of Exercise6_2


/* Sample Run
   Enter a  number: 234
   The sum of digits for 234 is 9
*/