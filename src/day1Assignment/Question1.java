package day1Assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your marks");
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();

		if (marks > 80) {
			System.out.println("Your Grade is A");
		} else if (marks > 60 && marks <= 80) {
			System.out.println("Your Grade is B");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("Your Grade is C");
		} else if (marks > 45 && marks <= 50) {
			System.out.println("Your Grade is D");
		} else if (marks > 25 && marks <= 45) {
			System.out.println("Your Grade is E");
		} else {
			System.out.println("You Grade is F");
		}

	}
		
	}


