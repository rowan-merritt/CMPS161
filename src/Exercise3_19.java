 // CMPS 161
 // Program Assignment 04
 // Paige "Aubrey" Merritt
 // W#0749642

/*
Page 113
3.19 (Compute the perimeter of a triangle) 
Write a program that 
	reads three edges for a triangle and 
	computes the perimeter if the input is valid. 
	Otherwise, display that the input is invalid. 
	
	The input is valid if the sum of every pairs of two edges 
		is greater than the remaining edge
*/

import java.util.Scanner;

public class Exercise3_19 {
   public static void main(String[] args) {

      // Enter three edges: Scanner(System.in)
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter three side of the triangle: " ) ;
	   double a = input.nextDouble();
	   double b = input.nextDouble();
	   double c = input.nextDouble();
		
      // Display results
	  // if (the sum of every pairs of two edges 
      //       is greater than the remaining edge)
	  //	   Display the perimeter of the triangle
	  // else
	  //	   Display the input is invalid
	   
	   if ( a + b > c && a + c > b && b + c > a ) {
		   System.out.print("The perimeter of the triangle is " + (a + b + c));
	   }
	   else{
		   System.out.print("Input is invalid");
		    
	   };
	   
   }
}

/* Sample Run
    Enter three edges: 3.0 4.0 5.0
    The perimeter of the triangle is 12.0

    Enter three edges: 1.0 2.0 3.0
    Input is invalid
*/
