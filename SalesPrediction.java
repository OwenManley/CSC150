/* ********************************** 
 CSC150 
 Assignment 2
 OwenManley
************************************/
public class SalesPrediction
{
 public static void main(String[] args)
 {
	 String name = "East Coast division";
	 int cost = 4600000; //The cost at which the company made 4.6 million in 2022.
	 double percent = 0.62; //The percentage used to find what the East Coast Division will generate.
	 String date = ("(2022)"); // The date at which $4.6 million was made.
	 System.out.println("The " + name + " will generate $" + (percent * cost) + " if the company");
	 // When wanting to write a math problem for java to generate in the system, simply combine both variables together following
	 //with a symbol of either (+,*,-, etc.) in between the two variables for the calculation.
	 System.out.println("makes $" + cost + " in sales this year " + date + ("."));
 } 
} // end of class SalesPrediction