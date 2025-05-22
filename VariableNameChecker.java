import java.util.Scanner;

public class VariableNameChecker {
	
	public static void main (String [] args) 
	 { 
	 String varName;
	 int count = 0;
	 Scanner stdIn = new Scanner (System.in); 
	 //prompt the user to enter a variable name 
	 System.out.println(" Enter a variable name (q or Q to quit): ");
	 varName = stdIn.next();
	 boolean valid = VariableChecker(varName); // to check if it is legal
	 do
	 {
	 if(valid)
	 {
		 if (Character.isLowerCase(varName.charAt(0)))
				 {		
			 		for( int i = 0; i<varName.length(); i++)
			 		{
			 			if( (Character.isLetterOrDigit(varName.charAt(i))))
			 				count++;
			 		}//end for
			 		
				 }//end nested if
				
			if ( count == varName.length())
				 {	
					System.out.println(" Good! ");
				 }// end nested if
				 
			else
					 
		 	{
		 		System.out.println(" Legal, but uses poor style. ");
		 	}//end nested if
	 }//end if
	 
	 else {
             System.out.println("Illegal");
	 
	 }// end else
	 
	 break;
	 }while(varName.equalsIgnoreCase("q")); // end do while loop
	
	 }// end main
	 
	

	

	 
	
	
	 public static boolean VariableChecker(String varName) 
	 { 
			if (Character.isDigit(varName.charAt(0)))
					{
						return false;
					}
			for (int i = 0; i<varName.length(); i++)
			{
				if (!Character.isLetterOrDigit(varName.charAt(i)) && (varName.charAt(i) != '$') && (varName.charAt(i) != '_') && (varName.charAt(i) != ' '))
					return false;
					
			}
			
			return true;

	 }
	 }  


