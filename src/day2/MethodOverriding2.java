package day2;

public class MethodOverriding2 extends MethodOverriding {

	public void sum(int a, int b)
	{
		System.out.println("I am a method from class MethodOverriding2" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverriding2 obj=new MethodOverriding2();
		obj.sum(10, 20);
	}

}
