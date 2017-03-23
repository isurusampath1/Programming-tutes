import java.util.Scanner;
class Celsius
{
	public static void main(String args[])
	{
		System.out.print("Enter the temperature on fahrenheit:");
		Scanner temp=new Scanner(System.in);
		int  fahrenheit=temp.nextInt();
	
		int celsius=5*(fahrenheit-32)/9;
		System.out.println("Temperature in Celsius is :"+celsius);
	}
}
