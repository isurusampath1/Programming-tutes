import java.util.Scanner;
class Test7
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
		
		int monthcount=0;
	
		if(cap.equals("JAN")) monthcount =1;
		if(cap.equals("FEB")) monthcount =2;
		if(cap.equals("MAR")) monthcount =3;
		if(cap.equals("APR")) monthcount =4;
		if(cap.equals("MAY")) monthcount =5;
		if(cap.equals("JUN")) monthcount =6;
		if(cap.equals("JUL")) monthcount =7;
		if(cap.equals("AUG")) monthcount =8;
		if(cap.equals("SEP")) monthcount =9;
		if(cap.equals("OCT")) monthcount =10;
		if(cap.equals("NOV")) monthcount =11;
		if(cap.equals("")) monthcount =12;

		System.out.println("This is month number "+monthcount);
	}
}
