// CMPS 161
// Program Assignment 02
// Paige "Aubrey" Merritt
// W0749642

/*
Page 70
2.1 (Converting Celsius	to	Fahrenheit)	
Write	a program that	
	reads	a Celsius degree in double	from the	console,	
	then converts it to Fahrenheit	and displays the result. 
	The formula	for the conversion is as follows:

		fahrenheit = (9 /	5)	* celsius +	32

	Hint:	In	Java,	9 / 5	is	1,	but 9.0 / 5	is	1.8.
	Here is a sample run:

		Enter	a temperature in Celsius: 43
		43.0 Celsius is 109.4 Fahrenheit
*/

import java.util.Scanner;

public class Exercise2_1 {
   public static void main(String[] args) {
       
	   
	   // Enter a temperature in celsius
	   // Class Notes Chapter 2 Page 5: Scanner
	   
	   Scanner input = new Scanner(System.in); // Create a Scanner object
	   
	   System.out.print("Enter a temperature for Celsius: "); // Asking for celsius input
	   double celsius = input.nextDouble(); // User input celsius value
	   
	   double fahrenheit; // Declare fahrenheit
	   
	   // Convert celsius to fahrenheit
	   // fahrenheit = (9.0 /	5)	* celsius +	32
	   
	   fahrenheit = (9.0/5) * celsius + 32; // Value added to fahrenheit
	   
	   // Display the result
	   // Class Notes Chapter 2 Page 3: System.out.printIn
	   
	   System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	  
   }
}

/* Sample Run
    Enter a temperature in Celsius: 43
    43.0 Celsius is 109.4 Fahrenheit
*/