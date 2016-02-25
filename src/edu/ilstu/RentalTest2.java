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
public class RentalTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mins = 0;
		Rental defaultRental = new Rental();
		defaultRental.setHoursAndMinutes(mins);
		
		Rental userInputRental = new Rental(promptContractNumber(), mins = promptRentalTime());
		userInputRental.setHoursAndMinutes(mins);
		
		//Display Default Rental Info
		//System.out.println("Default Rental");
		defaultRental.setHoursAndMinutes(mins);
		displayMotto();
		displayContractNumber(defaultRental);
		System.out.println("Total hours: " + defaultRental.getNumberHours());
		
		
		//User Rental Info Display
		displayMotto();
		displayContractNumber(userInputRental);
		System.out.println("Total hours: " + userInputRental.getNumberHours());
		System.out.println("Minutes: " + userInputRental.getExtraMinutes());
		System.out.println("Price: " + userInputRental.getPrice());
		
		
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
	 * Displays the Contract Number stored in a Rental object.
	 */
	public static void displayContractNumber(Rental rental1) {
		System.out.print("\nContract Number: " + rental1.getContractNumber() + "\n");
		
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
	
	public static String promptContractNumber() {
		Scanner kb2 = new Scanner(System.in);
		
		System.out.print("Please enter a contract number: ");
		return kb2.nextLine();
		
		
	}
}
