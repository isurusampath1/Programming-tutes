import java.util.Scanner;
class CricketTend
{
	public static void main(String args[])
	{
		System.out.print("Enter the chirp rate :");
		Scanner tend=new Scanner(System.in);
	
		double chirp_rate = tend.nextDouble();
	
		double T=40+chirp_rate/4.00;
	
		System.out.println("The Temperature is "+ T);
	}
}
