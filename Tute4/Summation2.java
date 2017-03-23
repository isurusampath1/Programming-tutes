import java.util.Random;
class Summation2
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int Randomint = rand.nextInt(99)+0;
		System.out.println("n = "+Randomint);
		int sum=0;
		for(int i=1;i<=Randomint;i++)
		{
			int k=i*i;
			sum+=k;
		}
		System.out.println("sum= "+sum);
		
		int sum1=Randomint*(Randomint +1)*(2*Randomint+1)/6;
		System.out.println("n*(n+1)(2n+1)/6= "+sum1);
		
		
	}
}
