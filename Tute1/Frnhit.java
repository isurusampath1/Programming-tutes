import java.util.Scanner;
class Frnhit
{
	public static void main(String args[])

	{
		System.out.print("Enter your Celsius temperature :");
		Scanner celsius = new Scanner(System.in);
		double Celsius=celsius.nextDouble();
	
		double Frn=1.8*Celsius+32.0;
		System.out.println("The temperature in Fahrenheit is : "+Frn);
	}
}
