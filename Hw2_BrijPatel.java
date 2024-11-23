//Brij Patel

import java.util.Scanner;

public class Hw2_BrijPatel {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a 4-bit binary number with a space after each number:"); //Tell user to input 4 numbers for their first binary number
		
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();  //make variables for the 4 numbers the user will input
		int num3 = keyboard.nextInt();
		int num4 = keyboard.nextInt();
		
		if(num1 >= 0 && num1 < 2)   //Create a if statement just in case the user inputs a number that is not a 1 or 0
		{
			if(num2 >= 0 && num2 < 2)
			{
				if(num3 >= 0 && num3 < 2)
				{
					if(num4 >= 0 && num4 < 2)
					{
						System.out.println("Enter another 4-bit binary number");
					}
					else
					{
						System.out.println("Invalid number entered.");
					}
				}
				else
				{
					System.out.println("Invalid number entered.");
				}
			}
			else 
			{
				System.out.println("Invalid number entered.");
			}
		}
		else 
		{
			System.out.println("Invalid number entered.");
		}
		
		int num5 = keyboard.nextInt();
		int num6 = keyboard.nextInt();
		int num7 = keyboard.nextInt();
		int num8 = keyboard.nextInt();
		
		if(num5 >= 0 && num5 < 2)
		{
			if(num6 >= 0 && num6 < 2)
			{
				if(num7 >= 0 && num7 < 2)
				{
					if(num8 >= 0 && num8 < 2)
					{
						int sum1 = ((num1 * 8) + (num2 * 4) + (num3 * 2) + (num4 * 1)); //does the math of a binary converter
						int sum2 = ((num5 * 8) + (num6 * 4) + (num7 * 2) + (num8 * 1));		
		
						System.out.println("The first number is" + " " + (sum1));
						System.out.println("The second number is" + " " + (sum2));
						System.out.println("The two numbers added together equal" + " " + (sum1 + sum2)); //adds the sums up and prints them
					}
					else
					{
						System.out.println("Invalid number entered.");
					}
				}
				else
				{
					System.out.println("Invalid number entered.");
				}
			}
			else 
			{
				System.out.println("Invalid number entered.");
			}
		}
		else 
		{
			System.out.println("Invalid number entered.");
		}
		
		
		
	}

}
