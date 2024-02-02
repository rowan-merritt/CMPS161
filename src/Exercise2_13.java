// CMPS 161
// Program Assignment 03
// Paige "Aubrey" Merritt
// W#0749642

/*
Page 73
2.13 (Financial application: compound value) 
Suppose you save $100 each month into a savings account 
with the annual interest rate 5%. 
Thus, the monthly interest rate is 0.05/12  = 0.00417. 

After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252 
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507 
and so on.

Write a program that prompts the user to enter a monthly saving amount and 
displays the account value after the sixth month. (In Exercise 5.30, 
you will use a loop to simplify the code and 
display the account value for any month.)

Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
*/


/* 
	Questions for Pao: 
 		- How do I keep the integer positive? 
*/

import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {

	   // Enter monthly saving: a positive integer
		
		Scanner input = new Scanner(System.in); // Create a Scanner
		   
		System.out.print("Enter the monthly saving amount: ");
		double accountVALUE = input.nextInt();
		
		// Original account value
		
		
    	// After the first month account value
		double  monthONE = accountVALUE * (1 + 0.00417);
 
     	// After the second month account value
		double  monthTwo =  (accountVALUE + monthONE ) * (1 + 0.00417);
		
    	// After the third month account value
		double  monthThree = (accountVALUE + monthTwo) * (1 + 0.00417);
  
    	// After the fourth month account value
		double  monthFour = (accountVALUE + monthThree) * (1 + 0.00417);
  
    	// After the fifth month account value
		double  monthFive = (accountVALUE + monthFour) * (1 + 0.00417);
  
    	// After the sixth month account value
		double  monthSix = (accountVALUE + monthFive) * (1 + 0.00417);
		
  
		// Display the sixth month account value
		System.out.println("After the sixth month, the account value is $" + monthSix);

  	}
}


/* Sample Run
	Enter the monthly saving amount: 100
	After the sixth month, the account value is $608.8181155768638
*/
