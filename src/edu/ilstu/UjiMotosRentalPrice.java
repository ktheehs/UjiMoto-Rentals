/*
* File name: UjiMotosRentalPrice.java
*
* Programmer: Kevin Theehs
* ULID: ktheehs
*
* Date: Jan 14, 2016
*
* Class: IT 178
* Lecture Section: 002
* Lecture Instructor: Sikolia
* 
*/
package edu.ilstu;

import java.util.Scanner;

/**
 *
 * Calculates how much a rental will cost based on time.
 * 
 * @author ktheehs
 *
 */
public class UjiMotosRentalPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables & Objects
		int minutesUsed;
		int hoursUsed;
		int remainingMinutes;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many minutes was the rental used for: ");
		minutesUsed = input.nextInt();
		
		hoursUsed = minutesUsed/60;
		
		remainingMinutes = (minutesUsed - (hoursUsed * 60));
		
		System.out.println();
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                   S");		
		System.out.println("S  Uji Moto makes fun in the sun    S");
		System.out.println("S                                   S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		System.out.println("Total hours used: " + hoursUsed);
		System.out.println("Total minutes used: " + remainingMinutes);
		
		System.out.println();
		System.out.println("Total Cost: $" + ((hoursUsed * 40) + (remainingMinutes * 1)));
		
		

	}

}
