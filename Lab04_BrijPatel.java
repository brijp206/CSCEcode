//Brij Patel

import java.util.Scanner;

public class Lab04_BrijPatel {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program.");
		System.out.println("Please enter the length and width for the first matrix:");
		
		int length1 = keyboard.nextInt(); //Make values for your length and width for both matrices
		int width1 = keyboard.nextInt();
		
		
		int[][] m1 = new int[length1][width1];
		
		for(int i = 0; i < m1.length; i++)
		{
			for(int j = 0; j < m1[i].length; j++)
			{
				System.out.println("Enter value at index" + " " + "[" + i + "]" + "[" + j + "]:");
				int num = keyboard.nextInt();
				m1[i][j] = num;
			}
		}
		
		System.out.println("Please enter the length and width for the second matrix:");
		
		int length2 = keyboard.nextInt();
		int width2 = keyboard.nextInt();
		
		
		int[][] m2 = new int[length2][width2];
		
		for(int i = 0; i < m2.length; i++)
		{
			for(int j = 0; j < m2[i].length; j++)
			{
				System.out.println("Enter value at index" + " " + "[" + i + "]" + "[" + j + "]:");
				int num = keyboard.nextInt();
				m2[i][j] = num;
			}
		}
		
		if(length1 == length2 && width1 == width2)  //If both matrices have the same width and the same length, the code will run
		{
			int num1 = m1[0][0];  //create variables for each number so it can print 
			int num2 = m1[0][1];
			int num3 = m1[1][0];
			int num4 = m1[1][1];
		
			System.out.println(num1 + " " + num2); //print them
			System.out.println(num3 + " " + num4);
			System.out.println("+");
		
			int num5 = m2[0][0];
			int num6 = m2[0][1];
			int num7 = m2[1][0];
			int num8 = m2[1][1];
		
			System.out.println(num5 + " " + num6);
			System.out.println(num7 + " " + num8);
			System.out.println("=");
		
			int sum1 = num1 + num5;  //Create a new variable that will add the 2 corresponding variables together
			int sum2 = num2 + num6;
			int sum3 = num3 + num7;
			int sum4 = num4 + num8;
			
			System.out.println(sum1 + " " + sum2); //print those new variables
			System.out.println(sum3 + " " + sum4);
		}
		
		else
		{
			System.out.println("Invalid Dimensions. These can't be added.");
		}
		

	}

}
