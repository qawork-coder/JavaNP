package day2;

public class MethodOverloading {

	public void sum(int val1, double val2) {
		System.out.println("Sum =" + (val1 + val2));
	}
	
	public void sum(int val1, int val2) {
		System.out.println("Sum =" + (val1 + val2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj=new MethodOverloading();
		obj.sum(10, 10);
		obj.sum(10, 10.10);
	}

}
