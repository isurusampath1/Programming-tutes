import java.util.Scanner;
class Greeting
{
	public static void main(String args[])
	{
		Scanner greet = new Scanner(System.in);
		System.out.print("Enter Your last name:");
		String lname=greet.next();

		System.out.print("Enter Your first name:");
		String fname=greet.next();
	
		System.out.println("Hello, "+fname +" "+ lname);
	}
}
