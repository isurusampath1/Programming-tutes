import java.util.Random;
class Test3
{
	public static void main(String args[])
	{
		int i,j,k;
		Random rand = new Random();
		int number=rand.nextInt();
		
		i=number%2;
		j=number%3;
		k=number%5;

		if(i==0||j==0||k==0)
			System.out.println("The Random number is divisible by 2,3 or 5");
		else
			System.out.println("The Random number is not divisible by 2,3 or 5");		
		
	}
}
