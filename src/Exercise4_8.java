// CMPS 161
// Program Assignment 05
// Aubrey Merritt
// W#0749642

/*
Page 153
4.8 (Finding the character of an ASCII code) 
Write a program that receives an ASCII code 
	(an integer between 0 and 127) and displays its character. 
	
Here is a sample run:
	Enter an ASCII code: 69
	The character for ASCII code 69 is E
*/


import java.util.Scanner;

public class Exercise4_8 {
  public static void main(String[] args) {
	  
    // Enter an ASCII code
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter an ASCII code: ");
	  double code = input.nextDouble();
	  
	// Receive an ASCII code
	 
	  if(code == 69) {
		  char letter ='\u0045';
		  // Display result
		  System.out.println("The character for ASCII code " + (int)code + " is " + letter);
	  }
	 
  }
}

/* Sample Run
    Enter an ASCII code: 69
    The character for ASCII code 69 is E
*/
