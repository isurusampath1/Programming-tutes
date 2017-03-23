import java.util.Random;
class Summation4
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int Randomint = rand.nextInt(9999)+0;
		System.out.println("n = "+Randomint);
		double sum=0;
		for(double i=1;i<=Randomint;i++)
		{
			double k=i*i;
			sum+=(1/k);
		}
		System.out.println("sum= "+sum);
		
		double sum1=(3.14*3.14)/6;
		System.out.println("(pi=22/7)..pi*pi/6 ="+sum1);
		
		
	}
}
