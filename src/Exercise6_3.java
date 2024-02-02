// CMPS 161
// Program Assignment 08
// Aubrey Merritt
// W#0749642

/*
Page 236
6.3 (Palindrome integer) 
Write the following two methods:

   // Return the reversal of an integer, i.e. reverse(456) returns 654
   public static int reverse(int number)

   // Return true if number is palindrome
   public static boolean isPalindrome(int number)

   Use the reverse method to implement isPalindrome. 
   A number is a palindrome if its reversal is the same as itself. 
   Write a test program that prompts the user to enter an integer and 
      reports whether the integer is a palindrome.

Sample run
   Enter a postive integer: 1234321
   1234321 is palindrome
*/

import java.util.Scanner;

public class Exercise6_3 {
	   public static void main(String[] args) {
	      // Enter a positive integer: Scanner(System.in)
		   Scanner input = new Scanner(System.in);
		   System.out.print("Enter a positive integer: ");
		   int digit = input.nextInt();

	  	   // if (the integer is a palindrome)
		   if (isPalindrome(digit) == true)
			   //Display it is palindrome
			   System.out.println(digit + " is a palindrome");
		   // else
		   else
			   //Display it is not palindrome
			   System.out.println(digit + " is not a palindrome");
	   }
	  
	   public static boolean isPalindrome(int number) {
	      // return if number is palindrome: call reverse method
		 if (reverse(number) == number)
			  return true;
		 else
			 return false;
	   }

	   public static int reverse(int number) {
		  int temp = (int)Math.abs(number);
	      int result = 0;
	      	// while (loop until all the digits are extracted)
	      	while (temp != 0) {
	      		// extract a digit (%) and  add the extracted digit into its reversal
	      		result = result * 10 + (temp % 10);
	      		
	      		// remove the extracted digit (/)
	      		temp = temp / 10;
	      	}
	      	return result;
	   }
	}

/* Sample run
   Enter a positive integer: 1234321
   1234321 is palindrome
*/