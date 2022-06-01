/*

Program: ${Assignment11}.java          Date: ${May 20th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);//calls in scanner.
		
		System.out.print("Please enter any three digits: ");
		int digits = input.nextInt();//allows user input.
		
		
		int number1 = digits/100;//stores first digit as an integer variable.
		int number2 = digits%100/10;//stores second digit as an integer variable.
		int number3 = digits%100%10;//stores third digit as an integer variable.
		
		//max
		if (number1 >= number2 && number1 >= number3)//checks if number1 is the largest number.
		{
			System.out.println("The largest of the three digits is: "+ number1);//prints number1 is the largest number.
		}
		else if (number2 >= number1 && number2 >= number3)//checks if number2 is the largest number.
		{
			System.out.println( "The largest of the three digits is: "+number2);//prints number2 is the largest number.
		}
		else//determines number3 is the largest number.
		{
			System.out.println("The largest of the three digits is: "+ number3 );//prints number3 is the largest number.
		}
		
		if (number1 <= number2 && number1 <= number3)//checks if number1 is the smallest number.
		{
			System.out.println("The smallest of the three digits is:"+ number1);//prints number1 is the smallest number.
		}
		else if (number2 <= number1 && number2 <= number3)//checks if number2 is the smallest number.
		{
			System.out.println( "The smallest of the three digits is: "+number2 );//prints number2 is the smallest number.
		}
		else//determines number3 is the smallest number.
		{
			System.out.println( "The smallest of the three digits is: "+number3 );//prints number3 is the smallest number.
		}

		System.out.println("The sum of the three digits is: " + (number1+number2+number3));//adds the 3 digits.
		
		System.out.println("The product of the three digits is: "+ (number1*number2*number3));//multiplies the 3 digits.
		
		System.out.println("The average of the three digits is: "+ (number1+number2+number3/3));//averages the 3 digits.
		

	}

}
/* Screen Dump

Please enter any three digits: 976
The largest of the three digits is: 9
The smallest of the three digits is: 6
The sum of the three digits is: 22
The product of the three digits is: 378
The average of the three digits is: 18


 */
