package day2;

public class MethodOverriding extends Sample {
	
	public void sum(int a, int b)
	{
		System.out.println("I am a method from class MethodOverriding");
	}
	
	public static void main(String args[])
	{
		MethodOverriding obj=new MethodOverriding();
		obj.sum(10, 20);
	}
}
