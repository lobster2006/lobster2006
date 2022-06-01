/*

Program: ${Assignment11}.java          Date: ${May 29th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource") // Suppresses warning from leaking "input" variable.
	Scanner input = new Scanner(System.in); // Calls in scanner.
	
		System.out.print("Enter a number between 1 and 20: "); // Asks the user for a guess.
		int inpt = input.nextInt(); // Stores input in the "inpt" variable.
		int random = (int)(Math.random()*20+1); // Generates a random number from 1 - 20.
	
		System.out.println("Computer's number is " + random +"."); // Prints a random number.
		System.out.println("Player's number is " + inpt +"."); // Prints the player's number.
	
	if (inpt == random) // Checks if the player's number = the random number.
	{
		System.out.println("You won, Congratulations!"); // Tells the user that they won.
	}
	else
	{
		System.out.println("You lost, Better luck next time!"); // Tells the user that they lost.
	}
	}

}
/* Screen Dump

Enter a number between 1 and 20: 16
Computer's number is 18.
Player's number is 16.
You lost, Better luck next time!

 */