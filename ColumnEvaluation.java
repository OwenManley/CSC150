/* ********************************** 
 CSC150 
 Assignment 5
 OwenManley
************************************/

	import java.util.Scanner;
	
	public class ColumnEvaluation 
{
	
		public static void main(String[]args)
{
	
		Scanner stdIn = new Scanner (System.in);
		double width;
		double height;
		double area;
		double elasticity = 1700000; // All the variables I will be using within this system.
		double load;
		double stress = 1450;
		final int SLENDERNESSSLIM = 50;
		
		
		
		System.out.println(" Enter column width in inches: ");
		width = stdIn.nextDouble();
		
		System.out.println(" Enter column height in feet: ");
		height = stdIn.nextDouble();
		
		area = (width*height*12); // This is so when the user inputs the values for height & width, it automatically makes this calculation for the area.
		
		System.out.println(" Enter expected load in pounds: ");
		load = stdIn.nextDouble();
		
			if ((12*height/width) <= SLENDERNESSSLIM)
			{
				if (load <= (0.3 *elasticity*area)/(12*height/width) * (12*height/width))
				{
					if (load <= area * stress)
					{
						System.out.println(" Column is safe. "); 	
					}
					else
					{
						System.out.println(" Column is unsafe. ");
					}

}
}
}
}