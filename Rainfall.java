
public class Rainfall {

	public static void main(String[]args)
	{
	// Array with this year's rainfall	
	double[] thisYear = {1.6, 2.1, 1.7, 3.5, 2.6, 3.7, 3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };
		
		
	System.out.println("The total rainfall this year is " + totalRainfall(thisYear)+ " inches.");
	System.out.println( "The average rainfall this year is " + averageRainfall(thisYear) + " inches.");
	System.out.println(" The highest amount of rainfall is " + highestRainfall(thisYear)+ " inches.");
	System.out.println(" The least amount of rainfall is " + lowestRainfall(thisYear) + " inches.");

	} //end main

	public static double totalRainfall(double[] thisYear)
	{
		double totalRain = 0;
		
		for (int i = 0; i < thisYear.length; i++)
		{
			totalRain = thisYear[i] + totalRain;
		
		}// end for
	
			return totalRain;
	
	}// end totalRainfall
	
	public static double averageRainfall(double[] thisYear)
	{
		double totalRain = 0;
		double count = 0;
		
		for (int i = 0; i < thisYear.length; i++)
		{
			totalRain = thisYear[i] + totalRain;
		
			count++;
			
		}// end for
		
		return totalRain/count;
		
	}// end averageRainfall
	
	public static double highestRainfall(double[] thisYear)
	{
		double greatest = 0;
		
		for (int i = 0; i < thisYear.length; i++)
		{
			if (greatest < thisYear[i])
			{
				greatest = thisYear[i];
			}
		
			}// end for
		
		return greatest;
		
		}// end highestRainfall
	
	public static double lowestRainfall(double[] thisYear)
	{
		double lowest = 1000000000;
		
		for (int i = 0; i < thisYear.length; i++)
		{
			if (lowest > thisYear[i])
			{
				lowest = thisYear[i];
			}
		
			}// end for
		
		return lowest;
	
	}// end lowestRainfall
	
	


















}// end class