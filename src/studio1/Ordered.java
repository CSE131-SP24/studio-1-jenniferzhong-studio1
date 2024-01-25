package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean isOrdered;
		boolean ascending = x < y && y < z;
		boolean descending = z < y && y < x;
		
		isOrdered = ascending || descending;
		System.out.print(isOrdered);

	}

}
