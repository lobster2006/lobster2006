/*

Program: ${Assignment11}.java          Date: ${May 27th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment15 
{
	@SuppressWarnings("resource") // suppresses warning from leaking "input" variable.
	Scanner input = new Scanner(System.in); // calls in scanner.
	
	int number1 = (int)(Math.random()*10+1); // generates a random number from 1 - 10.
	int number2 = (int)(Math.random()*10+1); // generates a random number from 1 - 10.
	int operator = (int)(Math.random()*4+1);// generates a random number to determine operator (*,+,-,/).
	{
	
	
	if(operator == 1) // Multiplication
	{
		System.out.print("What is " + number1 + "*" + number2 + "?"); // Multiplies the generated numbers.
		int ans = input.nextInt(); // Stores the input.
		
		if(ans == (number1*number2)) // Checks if the answer is correct.
		{
			System.out.print("You got it right! Congratulations!"); // Tells the user that they're right.
		}
		else
		{
			int ans2 = (number1*number2); // Calculates the answer.
			System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // Tells the user that they were wrong.
		}
	}
	else if(operator == 2) // Addition
	{
		System.out.print("What is " + number1 + "+" + number2 + "?"); //Asks the user to answer the question.
		int ans = input.nextInt(); // Stores the input.
		
		if(ans == (number1+number2)) // Checks if the answer is correct.
		{
			System.out.print("You got it right! Congratulations!"); // Tells the user that they're right.
		}
		else
		{
			int ans2 = (number1+number2); // Calculates the answer.
			System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // Tells the user that they weren't right.
		}
	}
	else if(operator == 3) // Subtraction
	{
		System.out.print("What is " + number1 + "-" + number2 + "?"); //Asks the user to the answer question.
		int ans = input.nextInt(); // Stores the input.
		
		if(ans == (number1-number2)) // Checks if the answer is correct.
		{
			System.out.print("You got it right! Congratulations!"); // Tells the user that they're right.
		}
		else
		{
			int ans2 = (number1-number2); // Calculates the answer.
			System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // Tells the user they weren't right.
		}
	}
	else // Division.
	{
		System.out.print("What is " + number1 + "/" + number2 + "?"); //Asks the user to answer the question.
		int ans = input.nextInt(); // Stores the input.
		
		if(ans == (number1/number2)) // Checks if the answer is correct.
		{
			System.out.print("You got it right! Congratulations!"); // Tells user they're right.
		}
		else
		{
			int ans2 = (number1/number2); // Calculates the answer.
			System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // Tells the user that they weren't right.
		}
		
	}
	}
}
/* Screen Dump




 */
