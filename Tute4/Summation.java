import java.util.Random;
class Summation
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int Randomint = rand.nextInt(99)+0;
		System.out.println("n = "+Randomint);
		int sum=0;
		for(int i=1;i<=Randomint;i++)
		{
			sum+=i;
		}
		System.out.println("sum= "+sum);
		
		int sum1=Randomint*(Randomint +1)/2;
		System.out.println("n*(n+1)/2= "+sum1);
		
		
	}
}
