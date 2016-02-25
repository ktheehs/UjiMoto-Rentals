/*
* File name: LessonWithRental.java
*
* Programmer: Kevin Theehs
* ULID: ktheehs
*
* Date: Feb 23, 2016
*
* Class: IT 178
* Lecture Section: 002
* Lecture Instructor: Sikolia
* 
*/
package edu.ilstu;

/**
 *
 * A subclass of Rental, determines if a rental is required with a specific 
 * type of equipment rental.
 * 
 * @author ktheehs
 *
 */
public class LessonWithRental extends Rental {
	
	private boolean lessonRequired;
	private final String[] instructorNames = {"John Paul", "Joe Beakman", "Jane Doe", "Bob Hope", "Taylor Swift", "Justin Bieber", "Lady Gaga", "Kim Kardashian"};
	private int equipmentType;
	
	public LessonWithRental(String eventNumber, int minutesRental, int equipmentType) {
		
		super(eventNumber, minutesRental);
		
		this.equipmentType = equipmentType;
		
		if((this.equipmentType == 0) || (this.equipmentType == 1))
			lessonRequired = true;
		else
			lessonRequired = false;
		
	}
	
	public String getInstructor() {
		
		return toString(equipmentType);
		
		
		
		
		}
		
		
		
	
	public String toString(int equipmentType) {
		String requirement;
		
		if(lessonRequired == true)
			requirement = "required";
		else
			requirement = "not required";
			
		
		return ("A lesson when renting a " + getEquipTypeString() + " is " + requirement + ". "
			 + "\nThe instructor is " + instructorNames[equipmentType]);
	}
	
	

}
