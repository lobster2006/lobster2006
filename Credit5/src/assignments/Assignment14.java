/*

Program: ${Assignment11}.java          Date: ${May 25th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable.
		Scanner input = new Scanner(System.in); // calls in scanner.
		
		System.out.print("Please enter your age: "); // Asks the user for their age.
		int age = input.nextInt(); // records given age in a variable.
		
		if(age <= 5) // checks if the inputed age is less than 5.
		{
			System.out.print("You are a toddler."); // tells the user that they're a toddler.
		}
		else if(age <= 10) // checks if the inputed age is less than 10.
		{
			System.out.print("You are a child."); // tells the user that they're a child.
		}
		else if(age <= 12) // checks if the inputed age is less than 12.
		{
			System.out.print("You are a preteen."); // tells the user that they're a pre-teen.
		}
		else if(age <= 18) // checks if the inputed age is less than 18.
		{
			System.out.print("You are a teen."); // tells the user that they're a teen.
		}
		else
		{
			System.out.print("You are an an adult."); // tells the user that they're an adult.
		}

	}

}
/* Screen Dump

Please enter your age: 15
You are a teen.

 */
