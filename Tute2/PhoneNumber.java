import java.util.Scanner;
class PhoneNumber
{
	public static void main (String args[])
	{
		
		Scanner nmbr= new Scanner(System.in);
		System.out.print("Enter your 10 digit phone number :");
		String number=nmbr.next();
		System.out.println("You entered "+number);
	
		int number1=Integer.parseInt(number);
		String code=number.substring(number.indexOf(number),3);
		int number2=Integer.parseInt(code);
		System.out.println("The area code is "+number2);

		String exchange=number.substring(3,6);
		int number3=Integer.parseInt(exchange);
		System.out.println("The exchange is "+number3);

		String number4=number.substring(6,10);
		int number5=Integer.parseInt(number4);
		System.out.println("The number is "+number5);
	
		System.out.println("The complete telephone number is ("+number2+") "+number3+"-"+number5);

		
	}
}
