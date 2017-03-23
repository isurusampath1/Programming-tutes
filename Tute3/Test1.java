import java.util.Random;
class Test1
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int n = rand.nextInt();
		System.out.println(n);

		if(n>0)
			System.out.println("Generated Random number is positive.");
	
		else
			System.out.println("Generated Random number is Negative.");
	}
}
