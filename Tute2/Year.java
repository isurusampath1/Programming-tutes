import java.util.Scanner;
class Year
{
	public static void main(String args[])
	{
		System.out.print("Enter the date in mm/dd/yy :");
		Scanner date=new Scanner(System.in);
	
		String da=date.nextLine();
		String d[]=da.split("/");
		System.out.println(d[0]+"/"+d[1]+"/19"+d[2]);
	}
}
