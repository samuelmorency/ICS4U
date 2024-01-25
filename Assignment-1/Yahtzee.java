/********************************************************************************
 * 
 * Created by: Sam Morency
 * Created on: November 2016
 * This is the class for Yahtzee's actual game mechanics
 *
********************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Yahtzee {
	
	//constructor
	public Yahtzee()
	{
		
	}
	
	public void playGame() throws IOException
	{
		System.out.println("Welcome to Yahtzee");
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		Die dieOne = new Die(1);
		Die dieTwo = new Die(1);
		Die dieThree = new Die(1);
		Die dieFour = new Die(1);
		Die dieFive = new Die(1);
		
		ScoreCard card = new ScoreCard();
		
		for (int turnCounter = 0; turnCounter < 13; turnCounter++)
		{
			System.out.println("Here is your Scorecard");
			
			card.drawScoreCard();
			
			
			for (int reRollCounter = 0; reRollCounter < 3; reRollCounter++)
			{	
				System.out.println("Here are your dice: " + 
						dieOne.getTopSideStr() + (" (1) ") + 
						dieTwo.getTopSideStr() + (" (2) ") +  
						dieThree.getTopSideStr() + (" (3) ") +  
						dieFour.getTopSideStr() + (" (4) ") +  
						dieFive.getTopSideStr() + (" (5)"));

	System.out.println("What dice would you like to roll? Type numbers with no spaces. max five characters. (or type 0 if you wish not to roll)");
	
	System.out.println("l");
	String input = null;
	//while (input == null)
	//{
		input = scan.readLine();
	//}
    
	System.out.println(input);
	
	String diceToRoll = input;
	
    if (diceToRoll != "0")
	{
		for (int diceCounter = 0; diceCounter < diceToRoll.length(); diceCounter++)
		{
			switch(String.valueOf(diceToRoll.charAt(diceCounter)))
			{
			case "1":
				dieOne.rollDie();
				break;
			case "2":
				dieTwo.rollDie();
				break;
			case "3":
				dieThree.rollDie();
				break;
			case "4":
				dieFour.rollDie();
				break;
			case "5":
				dieFive.rollDie();
				break;
			default:
				break;
			}
		}
			
	}
			}
			
			
			System.out.println("Here are your dice: " + 
					dieOne.getTopSideStr() + (" (1) ") + 
					dieTwo.getTopSideStr() + (" (2) ") +  
					dieThree.getTopSideStr() + (" (3) ") +  
					dieFour.getTopSideStr() + (" (4) ") +  
					dieFive.getTopSideStr() + (" (5)"));
			
			if (card.checkForYahtzee(dieOne.getTopSide(), dieTwo.getTopSide(), dieThree.getTopSide(), dieFour.getTopSide(), dieFive.getTopSide()) == true)
			{
				card.addBonus();
			}
			
			//put dice values into varables to be less cluttered
			int diceOne = dieOne.getTopSide();
			int diceTwo = dieTwo.getTopSide();
			int diceThree = dieThree.getTopSide();
			int diceFour = dieFour.getTopSide();
			int diceFive = dieFive.getTopSide();
			
			boolean errorLooping = true;
			while (errorLooping == true)
			{
				System.out.println("What box would you like to fill in? Enter a number between 1 and 13");
				int boxToFill = 0;
			
				boolean valid = false;
				
				while(valid == false){
					try {
					boxToFill = Integer.parseInt(scan.readLine());
					valid = true;
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				
				switch(boxToFill)
				{
				case 1:
					if (card._scores[1][0] != 1)
					{
						card.scoreAces(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 2:
					if (card._scores[1][1] != 1)
					{
						card.scoreTwos(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 3:
					if (card._scores[1][2] != 1)
					{
						card.scoreThrees(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 4:
					if (card._scores[1][3] != 1)
					{
						card.scoreFours(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 5:
					if (card._scores[1][4] != 1)
					{
						card.scoreFives(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 6:
					if (card._scores[1][5] != 1)
					{
						card.scoreSixes(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 7:
					if (card._scores[1][6] != 1)
					{
						card.score3OAK(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 8:
					if (card._scores[1][7] != 1)
					{
						card.score4OAK(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 9:
					if (card._scores[1][8] != 1)
					{
						card.scoreFullHouse(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 10:
					if (card._scores[1][9] != 1)
					{
						card.scoreSmStraight(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 11:
					if (card._scores[1][10] != 1)
					{
						card.scoreLgStraight(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 12:
					if (card._scores[1][11] != 1)
					{
						card.scoreYahtzee(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				case 13:
					if (card._scores[1][12] != 1)
					{
						card.scoreChance(diceOne, diceTwo, diceThree, diceFour, diceFive);
						errorLooping = false;
					}
					else
					{
						System.out.println("There is already an item in this spot.");
					}
					break;
				default:
					System.out.println("That is not a valid place");
					break;
					
				}
		}
}
		card.drawScoreCard();
		System.out.println("You finished with a total of " + card.calculateTotal() + " points");
		System.out.println("End");
	
	}
}
