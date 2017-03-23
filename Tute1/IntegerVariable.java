class IntegerVariable
{
	public static void main(String args[])
	{
		
		int n;
		n=Integer.parseInt(args[0]);
		int thousand;
		thousand=n/1000;
	
		int remain=n%1000;
		int hundred=remain/100;

		int remain1=remain%100;
		int ten=remain1/10;

		int remain2=remain1%10;

		System.out.println("The digit of n are "+thousand+","+hundred+","+ten+" and "+remain2);
		
	}
}
