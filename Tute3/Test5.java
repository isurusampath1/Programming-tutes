import java.util.*;
class Test5
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int year=Math.round(200*rand.nextFloat() + 1800);
		
		if(year>1584)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year.");
			else
			{
				if(year%4==0&&year%100!=0)
				{
					System.out.println(year+ " is a leap year");
				}
				else
				{
					System.out.println(year+" is not a leap year");			
				}
			}
		}
		else
			System.out.println(year+" is not a leap year");
				
	}
}
