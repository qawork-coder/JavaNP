package day1;

import java.util.Scanner;

public class MethodWithParameters {

	public void eligibility(int age) // Method with parameters
	{
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			System.out.println("Not eligible");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithParameters obj = new MethodWithParameters();
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		obj.eligibility(val);// Calling a method

	}

}
