/*

Program: ${Assignment11}.java          Date: ${May 21th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in); // calls in scanner.
		
		System.out.print("Enter a grade percentage: "); // asks the user for a grade.
		int grade = input.nextInt(); // stores grade in variable.
		
		if (grade <= 100 && grade >=90) // checks if the inputed grade is from 90-100.
		{
			System.out.print("You have gotten an A+!"); // System tells the user they have an A+.
		}
		else if (grade <= 89 && grade >= 80) // checks if the inputed grade is from 80-89.
		{
			System.out.print("You have gotten an A!"); // System tells the user they have an A.
		}
		else if (grade <=79 && grade >= 75) // checks if the inputed grade is from 75-79.
		{
			System.out.print("You have gotten a B+."); // System tells the user they have a B+.
		}
		else if (grade <= 74 && grade >= 70) // checks if the inputed grade is from 70-74.
		{
			System.out.print("You have gotten a B."); // System tells the user they have a B.
		}
		else if (grade <= 69 && grade >= 65) // checks if the inputed grade is from 65-69.
		{
			System.out.print("You have gotten a C+."); // System tells the user they have a C+.
		}
		else if (grade <= 64 && grade >= 60) // checks if the inputed grade is from 60-64.
		{
			System.out.print("You have gotten a C."); // System tells the user they have a C.
		}
		else if (grade <= 59 && grade >= 55) // checks if the inputed grade is from 55-59.
		{
			System.out.print("You have gotten a D+."); // System tells the user they have a D+.
		}
		else if (grade <= 54 && grade >= 50) // checks if the inputed grade is from 50-54.
		{
			System.out.print("You have gotten a D."); // System tells the user they have a D.
		}
		else
		{
			System.out.print("You have gotten a F, you failed."); // System tells the user they have an F and that they've failed.

	}

	}
}
/* Screen Dump

Enter a grade percentage: 87
You have gotten an A!

 */