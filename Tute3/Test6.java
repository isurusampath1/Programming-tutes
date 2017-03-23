import java.util.Scanner;
class Test6
{
	public static void main(String args[])
	{
		Scanner month=new Scanner(System.in);
		System.out.print("Enter the month:");
		String month1=month.next();
		
		System.out.println("You entered "+month1);
		String extra=month1.substring(0,3);
		//System.out.println(extra);
		String cap=extra.toUpperCase();
		System.out.println("Its abbreviation is "+cap);
		
		char letter1=cap.charAt(0);
		char letter2=cap.charAt(1);
		char letter3=cap.charAt(2);
	
		
		
		if (letter1=='A')
		{
			if(letter2=='P')
				System.out.println("This is month number 4");
			else
				System.out.println("This is month number 8");
		}
		else if(letter1=='F')
				System.out.println("This is month number 2");
		else if(letter1=='J')
		{
			if (letter2=='A')
			{
				System.out.println("This is month number 1");
			}
			else if(letter2=='U')
			{
				if (letter3=='L')
					System.out.println("This is month number 7");
				else
					System.out.println("This is month number 6");
			}
		}
		else if (letter1=='D')
			System.out.println("This is month number 12");
		else if (letter1=='S')
			System.out.println("This is month number 9");
		else if(letter1=='O')
			System.out.println("This is month number 10");
		else if(letter1=='N')
			System.out.println("This is month number 11");
		else if(letter2=='A')
		{
			if (letter3=='R')
				System.out.println("This is month number 3");
			else
				System.out.println("This is month number 5");
		}
		
		
	}
}
