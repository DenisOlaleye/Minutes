/*Write a program that accepts a number of minutes and converts it both to hours
and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days.
Save the program as MinutesConversion.java*/

import java.util.Scanner;

public class Minutes 
{
	public static void main (String [] args)
	{
		
		float hours;
		float days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of minutes >> ");
		float minutes = input.nextInt(); 
		
		hours = minutes/60;
		days = (float)hours/24;
		
		System.out.printf(minutes+ " minutes equals " +hours+ " hours or "
				+days+ " days.");
	}

}
