import java.util.Scanner;
class Test4
{
	public static void main(String args[])
	{
		Scanner names=new Scanner(System.in);
		System.out.print("Enter your first name:");
		String name1=names.nextLine();
		System.out.print("Enter your second name:");
		String name2=names.nextLine();
		System.out.print("Enter your third name:");
		String name3=names.nextLine();

		if(name1.compareTo(name2) <= 0)
		{
			if(name1.compareTo(name3) <= 0)
			{
				System.out.println(name1);
				if(name2.compareTo(name3) <= 0)
				{
					System.out.println(name2);
					System.out.println(name3);
				}
				else
				{
					System.out.println(name3);
					System.out.println(name2);
				};
			}
			else
			{
				System.out.println(name3);
				System.out.println(name1);
				System.out.println(name2);
				
			};
		}
		else
		{
			if(name2.compareTo(name3) <= 0)
			{
				System.out.println(name2);
				if(name1.compareTo(name3) <= 0)
				{
					System.out.println(name1);
					System.out.println(name3);
				}
				else
				{
					System.out.println(name3);
					System.out.println(name1);
				};
			}
			else
			{
				System.out.println(name3);
				System.out.println(name2);
				System.out.println(name1);
			};
		};

	}
}
