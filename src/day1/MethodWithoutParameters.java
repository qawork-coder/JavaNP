package day1;

public class MethodWithoutParameters {

	// class block

	public void checkEligibility() {
		int age = 10;
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			System.out.println("Not eligible");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithoutParameters obj = new MethodWithoutParameters();
		//new is allocating memory 
		obj.checkEligibility();
		

	}

}
