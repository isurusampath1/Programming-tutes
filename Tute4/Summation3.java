import java.util.Random;
class Summation3
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int Randomint = rand.nextInt(99)+0;
		System.out.println("n = "+Randomint);
		int sum=0;
		for(int i=1;i<=Randomint;i++)
		{
			int k=i*i*i;
			sum+=k;
		}
		System.out.println("sum= "+sum);
		
		int sum1=Randomint*Randomint*(Randomint + 1)*(Randomint + 1)/4;
		System.out.println("n*n(n+1)(n+1)/4= "+sum1);
		
		
	}
}
