package day1Assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String args[])
	{
		System.out.println("Enter a Number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num%2==0) {
			System.out.println("Your Number is Even");
		} else
			System.out.println("You rNumber is odd");
	}
}
