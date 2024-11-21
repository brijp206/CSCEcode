//Brij Patel

import java.util.Scanner;

public class Lab02_BrijPatel {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Triangle-Maker!");
		System.out.println("Enter the size of the triangle.");
		int num = keyboard.nextInt(); 
		
		for (int i = 0; i < num; i++)   //Increasing interval
		{
			for (int j = 1; j > 0; j--)
			{
				System.out.println(" "); //Prints the next line
			}
			
			for (int k = 0; k <= i; k++) 
			{
				System.out.print("*"); //Prints the asterisk up until the number that the user has inputed
			}

		}
		
		for (int i = num - 1; i > 0; i--)   //Decreasing interval
		{
			for (int j = 1; j > 0; j--)
			{
				System.out.println(" ");
			}
						
			for (int k = 0; k < i; k++)
			{
				System.out.print("*"); //Prints the asterisks in a decreasing order until it goes to 1
			}

		}
		if (num <= 0)
		{
			System.out.println("Invalid number.");
		}
		
	}

}
