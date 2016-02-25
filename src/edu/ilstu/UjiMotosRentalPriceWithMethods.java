/*
* File name: UjiMotosRentalPriceWithMethods.java
*
* Programmer: Kevin Theehs
* ULID: ktheehs
*
* Date: Jan 19, 2016
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
public class UjiMotosRentalPriceWithMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int minutes = 0;
		minutes = promptRentalTime();
		RentalTest.displayMotto();
		computeRentalInfo(minutes);
	}
	
	/*
	 * Prompts for rental price in mins
	 */

	public static int promptRentalTime() {
		
		int minutesUsed;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many minutes was the rental used for: ");
		minutesUsed = input.nextInt();
		
		return minutesUsed;
	}
	
	/*
	 * Displays motto
	 */
	public static void displayMotto() {
		
		System.out.println();
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                   S");		
		System.out.println("S  Uji Moto makes fun in the sun    S");
		System.out.println("S                                   S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	
	/*
	 * Computes hours, extra minutes, and price for 
	 * rental & displays details
	 */
	public static void computeRentalInfo(int minutesUsed) {
		final int MINUTES_IN_HOUR = 60;
		final int HOUR_RATE = 40;
		
		
		int hoursUsed = minutesUsed/MINUTES_IN_HOUR;
		
		int remainingMinutes = (minutesUsed - (hoursUsed * MINUTES_IN_HOUR));
		
		System.out.println("Total hours used: " + hoursUsed);
		System.out.println("Total minutes used: " + remainingMinutes);
		
		System.out.println();
		System.out.println("Total Cost: $" + ((hoursUsed * HOUR_RATE) + (remainingMinutes * 1)));
		
		
	}
}
