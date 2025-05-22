/* **********************************
CSC150
Assignment_4
Owen Manley
************************************/

import java.util.Scanner;


public class EconomicPolicy 
{
	
	public static void main(String[]args)
{
	Scanner stdIn = new Scanner (System.in);
	double growthRate;
	double inflation;
	
	System.out.println(" Enter growth rate: ");
	growthRate = stdIn.nextDouble();
	
	System.out.println(" Enter inflation rate: ");
	inflation = stdIn.nextDouble();
	
	if (growthRate < 1)
	{
		if (inflation < 3)
		{
			System.out.println(" Increase welfare spending, reduce personal taxes, and decrease discount rate. ");
		}
		else 
		{
			System.out.println(" Reduce business taxes. ");
		}
	}	
	if (growthRate > 4)
	{
		if (inflation < 1)
			System.out.println(" Increase personal and business taxes, and decrease discount rate. ");
		else if (inflation > 3)
		{
			System.out.println(" Increase discount rate. ");
		}
		
	
	
	else
		{
			System.out.println(" No change in economic policy. ");
		}
}	
}
}