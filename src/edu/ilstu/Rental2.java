/*
* File name: Rental.java
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

/**
 *
 * Has methods that get more information about a rental.
 * 
 * @author ktheehs
 *
 */
public class Rental {
	
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURLY_RATE = 40;
	
	private int numberMinutes;
	private String contractNumber;
	private int numberHours;
	//private int extraMinutes;
	private int hours;
	private double price;
	
	/*
	 * Main Constructor w/ information passed
	 */
	public Rental(String contractNumber, int minutes) {
		this.contractNumber = contractNumber;
		numberMinutes = minutes;
	}
	
	
	/*
	 * Default Constructor
	 */
	public Rental() {
		contractNumber = "A000";
		numberMinutes = 0;
	}
	
	
	public void setContractNumber(String passedContractNumber) {
		contractNumber = passedContractNumber;
	}
	
	public void setHoursAndMinutes(int minutes) {
		numberHours = numberMinutes/MINUTES_IN_HOUR;
		
		numberMinutes = (numberMinutes - (hours * MINUTES_IN_HOUR));
		
		price = ((hours * 40) + (numberMinutes * 1));
	}
	
	public String getContractNumber() {
		return contractNumber;
	}

	public int getNumberHours() {
		return numberHours;
	}

	public int getExtraMinutes() {
		return numberMinutes;
	}

	public double getPrice() {
		return price;
	}

	
	
	

}
