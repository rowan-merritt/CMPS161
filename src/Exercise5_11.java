// CMPS 161
// Program Assignment 06
// Aubrey Merritt
// W#0749642

/*
Page 196
5.11 (Finding numbers divisible by 5 or 6, but not both) 
Write a program that displays all the numbers 
   from 100 to 200 (10 per line) 
   that are divisible by 5 or 6, but not but both.
   Numbers are separated by exactly one space.
*/

public class Exercise5_11 {
	public static void main(String[] args) {

		int count = 0;
		
		// for (the numbers from 100 to 200) 
		for ( int num = 100; num <= 200; num++ ) {
			
			// if (this number is divisible by 5 or 6, but not both)
			if ( num % 5 == 0 ^ num % 6 == 0 ) {
				count++;
				
				// Display this number (ten per line): System.out.print
				
				if ( count % 10 != 0) {
					System.out.print(num + " ");					
					//count = 0;
				}
				else{
					System.out.print(num + "\n");
				}
				
			}
			
		}
		
	}
}

/* Output
    100 102 105 108 110 114 115 125 126 130
    132 135 138 140 144 145 155 156 160 162
    165 168 170 174 175 185 186 190 192 195
    198 200 
*/