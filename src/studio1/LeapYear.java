package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = in.nextInt();
		
		boolean test1 = year % 4 == 0 && year % 100 != 0;
		boolean test2 = year % 400 == 0;
		boolean isLeapYear = test1 || test2;
		
		System.out.print(year + " is a leap year: " + isLeapYear);
		
		
		
	
	}
}
