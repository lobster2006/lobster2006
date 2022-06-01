/*

Program: ${Assignment11}.java          Date: ${May 23th, 2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
 

*/
package assignments;

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);//calls in scanner.
		NumberFormat dc = NumberFormat.getCurrencyInstance();//variable to change the input into money.
		
		System.out.println("Enter the number of copies to be printed: ");//asks the user for input.
		int sheets = input.nextInt();//allows user input.
		
		if (sheets >= 0 && 99 >= sheets)//minimum and maximum input range.
		{
			System.out.println("Price per copy: $0.30");//tells the user the value of a sheet.
			double value1 = (sheets*0.30);//finds the price.
			System.out.println("Total cost is: "+dc.format(value1));//changes the format to money.
		}
		else if (sheets >= 100 && 499 >= sheets)//minimum and maximum input range.
		{
			System.out.println("Price per copy: $0.28");//tells the user the value of a sheet.
			double value2 = (sheets*0.28);//finds out how much it will cost to print out how many sheets were requested	
			System.out.println("Total cost is: "+dc.format(value2));//changes the format to money.
		}
		else if (sheets >= 500 && 749 >= sheets)//minimum and maximum input range.
		{
			System.out.println("Price per copy: $0.27");//tells the user the value of a sheet.
			double value3 = (sheets*0.27);//finds out how much it will cost to print out how many sheets were requested
			System.out.println("Total cost is: "+dc.format(value3));//changes the format to money.
		}
		else if (sheets >= 750 && 1000 >= sheets)//minimum and maximum input range .
		{
			System.out.println("Price per copy: $0.26");//tells the user the value of a sheet.
			double value4 = (sheets*0.26);//finds out how much it will cost to print out how many sheets were requested.		
			System.out.println("Total cost is: "+dc.format(value4));//changes the format to money.
		}
		else if (sheets > 1000)//max of input. 
		{
			System.out.println("Price per copy: $0.25");//tells the user the value of a sheet.
			double value5 = (sheets*0.25);//finds out how much it will cost to print out how many sheets were requested
			System.out.println("Total cost is: "+dc.format(value5));//changes the format to money.
		}

	}

}
/* Screen Dump

Enter the number of copies to be printed: 
967
Price per copy: $0.26
Total cost is: $251.42

 */
