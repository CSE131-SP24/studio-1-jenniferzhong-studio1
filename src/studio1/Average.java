package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("The first of two integers to be averaged?");
		double n1 = in.nextDouble();
		System.out.println("The second of two integers to be averaged?");
		double n2 = in.nextDouble();
		
		double average = (n1 + n2)/2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
	}

}
