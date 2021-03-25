package day1Assignment;

import java.util.Scanner;

public class Question4 {

	public void sum(int val1, double val2) {
		System.out.println("Sum =" + (val1 + val2));
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		
		System.out.println("Enter a double number");
		double val2 = scan.nextDouble();
		Question4 obj = new Question4();
		obj.sum(val1, val2);
	}

}
