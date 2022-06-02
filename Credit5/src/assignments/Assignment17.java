/*

Program: ${Assignment17}.java          Date: ${May 31th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) 
	{
		//
		@SuppressWarnings("resource") // suppresses warning from leaking "input variable".
		Scanner input = new Scanner(System.in); // Calls in scanner.
		
		System.out.print("Please enter your GPA (Input \"-1\" to terminate the program):"); // Asks user for their GPA.
		double gpa = input.nextDouble(); // Stores the inputed GPA as a variable.
		
		if (gpa == -1) // Checks if the input is -1.
		{
			System.out.print("Thank you for using our program, have a great day!"); // Exit Message.
			System.exit(0); // Ends the program.
		}
		while (gpa != -1) // If the input is not -1.
		{
			
			if (gpa >= 3.8) // Checks if the inputed GPA is greater than 3.8.
			{
				System.out.println("Summa Cum Laude"); // Prints an output.
			}
			else if (gpa >= 3.65) // Checks if the inputed GPA is greater than 3.65.
			{
				System.out.println("Magna Cum Laude"); // Prints an output.
			}
			else if (gpa >= 3.5) // Checks if the inputed GPA is greater than 3.5.
			{
				System.out.println("Cum Laude"); // Prints an output.
			}
			else
			{
				System.out.println("Sorry, at this time you did not qualify for an honors distinction."); // Tells the user that they didn't qualify.
			}
			
			System.out.println("Please enter -1 to terminate the program or enter another GPA:"); // Asks user if they want to run program again.
			gpa = input.nextDouble(); // Re-records given GPA
			if (gpa == -1) // Checks if the input is -1
			{
				System.out.print("Thank you for using this program, have a great day!"); // Exit Message
				System.exit(0); // Ends the program
			}
		}

	}

}
/* Screen Dump

Please enter your GPA (Input "-1" to terminate the program):3.6
Cum Laude
Please enter -1 to terminate the program or enter another GPA:
3.7
Magna Cum Laude
Please enter -1 to terminate the program or enter another GPA:
4
Summa Cum Laude
Please enter -1 to terminate the program or enter another GPA:
2
Sorry, at this time you did not qualify for an honors distinction.
Please enter -1 to terminate the program or enter another GPA:
-1
Thank you for using this program, have a great day!

 */
