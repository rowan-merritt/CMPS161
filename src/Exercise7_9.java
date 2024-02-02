// CMPS 161
// Program Assignment 09
// Aubrey Merritt
// W#0749642

/*
Page 282
7.9 (Finding the smallest element) 
Write a method that 
   finds the smallest element is an array of double using the following header: 

      public static double min(double[] array)

Write a test program that 
   prompts the user to enter 10 numbers, 
   invokes this method to return the minimum value, 
   and displays the minimum value. 
   Here is a sample run of the program:
   
      Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
      The minimum number is 1.5
*/

import java.util.Scanner;

public class Exercise7_9 {
   public static void main(String[] args) {
	   double[] numbers = new double[10];
  
      // Enter ten double numbers: Scanner(System.in)
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      
      double userInput = input.nextDouble();
      
      for ( int x = 0; x < numbers.length - 1; x++)
    	numbers[x] = input.nextDouble();
    	  

      // Call method min and then display the result
      System.out.print("The minimum number is " + min(numbers));
   }

   public static double min(double[] list) {
      double m = list[0]; 	// m is the smallest element

      // for (i = 1 to list.length - 1)
      for (int i = 1; i < list.length - 1; i++)
    	  
    	  // if (m is larger than list[i])
    	  if (m > list[i])
    		  
    		  // list[i] is the new smallest element
    		  m = list [i];

	  // return the smallest element, m 
      return m;
   }
}

/* Sample Run:
   Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
   The minimum number is 1.5
*/
