package day1;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=3;
		
		switch(day)//switch(2)
		{
		case 1: System.out.println("its monday");
				break;//Break statement helps to exit the iteration when condition is met
		case 2: System.out.println("Its tuesday");
				break;
		case 3 :System.out.println("Its wednesday");
				break;
		default: System.out.println("Please check your value");
		}
	}

}

//Java is sequential language 
