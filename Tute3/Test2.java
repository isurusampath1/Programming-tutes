import java.util.Random;
class Test2
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int number1=rand.nextInt();
		int number2=rand.nextInt();

		if(number1>number2)
			System.out.println(number2+"  is the Minimum number.");
		else
			System.out.println(number1+"  is the Minimum number.");
	}
}
