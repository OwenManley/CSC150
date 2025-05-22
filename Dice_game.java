/* **********************************
CSC150
Assignment_7
Owen Manley
************************************/
import java.util.Scanner;

public class Dice_game {

public static void main(String[] args)
{

	Scanner scanner = new Scanner(System.in);
	String playGame; //This variable determines whether or not the game will start or not 
	int countone = 0;// Counts the number of times the user wins a round 
	int counttwo = 0;// Counts the number of times the computer wins a round 
	int rounds = 0;// Tallies up the number of rounds played
	
	System.out.println(" Lets play a game of dice! We both roll and whoever is higher after 5 turns wins! Do you want to play? (y/n)");
	playGame = scanner.next();// inputs either "y" for yes, or "n" for no
	
while (playGame.equalsIgnoreCase("y")) //while loop for the game 
{
	
	int  human = (int)(Math.random() *6) +1 ;// rolls a random number between 1 and 6 for both the computer and the user
	int machine = (int)(Math.random() *6) +1 ;
	
	if (human > machine )
	{
		System.out.println(" You win! "); //if user's roll is greater than the computer, user wins the round
		countone++;
		rounds++;
	}// end else
	
	else if (machine > human )
	{
		System.out.println(" Computer wins! "); //if computer rolls a value greater than the user. user wins the round
		counttwo++;
		rounds++;
	} //end else if
	
	else
	{
		System.out.println(" Tie! "); // if both roll the same value the round is a tie
		rounds++;
	}// end else
	
// your code 
System.out.println(" Your number is: " + human); // tells the user the amount of times they won
System.out.println(" Computer's number is: " + machine);
System.out.println(" Would you like to play again? (y/n) ");
playGame = scanner.next();

}// end while loop
while ( playGame.equalsIgnoreCase("n"))
{
	if ( countone > counttwo)
	{
		System.out.println(" You win the game! Thanks for playing! ");
	}// end if
	
	else if (counttwo > countone)
	{
		System.out.println(" The computer wins! thanks for playing!");
	}// end else if
	
	else
	{
		System.out.println(" It is a tie game! Thanks for playing! ");
	}// end else
System.out.println(" Your score: " + countone);
System.out.println(" Computer's score: " + counttwo);
break;
}// end else
}// end class
}// end main
