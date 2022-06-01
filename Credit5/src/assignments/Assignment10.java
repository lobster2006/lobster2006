/*

Program: ${Assignment10}.java          Date: ${May 18th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;
import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking "input" variable.
		Scanner input = new Scanner(System.in); // calls in scanner.
		
		System.out.print("Enter an integer: ");
		int int1 = input.nextInt(); // stores input in the int1 variable.
		
		int int2 = (int1/2); // divides the input by half.
		int ans1 = (int1%int2); // gets remainder of half of the input.
		
		if(ans1 == 1) // checks if there's a remainder of 1.
		{
			System.out.print("\nThe integer " + int1 + " is odd."); // tells user it's odd.
		}
		else
		{
			System.out.print("\nThe integer " + int1 + " is even."); // tells user it's even.
		}

	}

}
/* Screen Dump
 
//if you input an odd number
Enter an integer: 25

The integer 25 is odd.

//if you input an even number
 Enter an integer: 46

The integer 46 is even. 
 
 */
