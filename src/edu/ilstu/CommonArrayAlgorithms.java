package edu.ilstu;

import java.util.Scanner;


/*
 * IT 178 - Topic 2
 */
public class CommonArrayAlgorithms {

	public static void main(String[] args) {
		
		int [] values = new int [10];
		
		//1. Filling
		System.out.print("Filling an array with squares: ");
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i * i;
			System.out.print(values[i]);
		}
		System.out.println();
		
		//2. Sum and average value
		System.out.print("Sum and average value: ");
		int total = 0;
		for (int element : values) //enhanced for loop
		{
			total = total + element;
			System.out.print(total);
		}
		
		System.out.println();
		
		double average = 0;
		if (values.length > 0)
		{
			average = total/values.length;
		}
		System.out.println("The everage of values is: " + average);
		
		
		//3. Maximum and minimum		
		int largestValue  = values[0];
		for (int i = 0; i < values.length; i++)
		{
			if (values[i] > largestValue) // reverse if you want the smallest value
				largestValue = values[i];
		}
		
		System.out.println("The largest value is: " + largestValue);	
		
		//4. Element separators		
		System.out.print("Element separators : ");
		for (int i = 0; i < values.length; i++)
		{
			if(i > 0)
			{
				System.out.print(" . ");
			}
			System.out.print(values[i]);
		}
		
		System.out.println();	
		
		//5. Linear search
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value to be searched: ");
		int searchedValue = keyboard.nextInt();
		int position = 0;
		boolean found = false;
		while (position < values.length && !found)
		{
			if (values[position] == searchedValue)
			{
				found = true;		
			}
			else
			{
				position++;
			}
		}
		if (found)
		{
			System.out.println("Found at position: " + position);
		}
		else
		{
			System.out.println("Not found ");
		}

	}

}