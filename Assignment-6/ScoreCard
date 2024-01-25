/********************************************************************************
 * 
 * Created by: Sam Morency
 * Created on: November 2016
 * This is score card class
 *
********************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ScoreCard {
	
	private String _scoreCard; 
	public int _bonus = 0;
	public int[][] _scores = new int [2][13];
	
	public void drawScoreCard()
	{
		String[] stringScores = new String[13];
		
		//put scores into a list of strings to print on scorecard
		for (int elementCounter = 0; elementCounter < _scores[0].length; elementCounter++)
		{
			if (_scores[1][elementCounter] == 1)
			{
				stringScores[elementCounter] = Integer.toString(_scores[0][elementCounter]);
			}
			else
			{
				stringScores[elementCounter] = " ";
			} 
		}
		
		this._scoreCard =
		 " Index         Category         Score /r/n"
		+"                                      /r/n"
		+"              Upper Card              /r/n"
		+"                                      /r/n"
		+"   1             Aces           " + stringScores[0] + "/r/n"
		+"   2             Twos           " + stringScores[1] + "/r/n"
		+"   3            Threes          " + stringScores[2] + "/r/n"
		+"   4             Fours          " + stringScores[3] + "/r/n"
		+"   5             Fives          " + stringScores[4] + "/r/n"
		+"   6             Sixes          " + stringScores[5] + "/r/n"
		+"                                      /r/n"
		+"              Lower Card              /r/n"
		+"                                      /r/n"
		+"   7          3 of a kind       " + stringScores[6] + "/r/n"
		+"   8          4 of a kind       " + stringScores[7] + "/r/n"
		+"   9          Full House        " + stringScores[8] + "/r/n"
		+"   10       Small Straight      " + stringScores[9] + "/r/n"
		+"   11       Large Straight      " + stringScores[10] + "/r/n"
		+"   12          Yahtzee          " + stringScores[11] + "/r/n"
		+"   13           Chance          " + stringScores[12] + "/r/n"
		+"/r/n"
		+"                 Bonus          " + _bonus + "/r/n"
		+"                 Total          " + calculateTotal() + "/r/n";
		
		System.out.println(this._scoreCard.replaceAll("/r/n+",System.getProperty("line.separator")));
	}
	
	public boolean checkForYahtzee(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		if (dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//add yahtzee bonus
	public void addBonus()
	{
		this._bonus = this._bonus + 100;
	}
	
	public int calculateTotal()
	{
		int total = _scores[0][0] + 
					_scores[0][1] + 
					_scores[0][2] + 
					_scores[0][3] + 
					_scores[0][4] + 
					_scores[0][5] + 
					_scores[0][6] + 
					_scores[0][7] + 
					_scores[0][8] + 
					_scores[0][9] + 
					_scores[0][10] + 
					_scores[0][11] + 
					_scores[0][12] + 
					this._bonus;
		
		return total;
		
	}
	
	public void scoreAces(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 1)
		{
			score++;
		}
		if (dice2 == 1)
		{
			score++;
		}
		if (dice3 == 1)
		{
			score++;
		}
		if (dice4 == 1)
		{
			score++;
		}
		if (dice5 == 1)
		{
			score++;
		}
		
		_scores[0][0] = score;
		_scores[1][0] = 1;
	}
	
	public void scoreTwos(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 2)
		{
			score = score + 2;
		}
		if (dice2 == 2)
		{
			score = score + 2;
		}
		if (dice3 == 2)
		{
			score = score + 2;
		}
		if (dice4 == 2)
		{
			score = score + 2;
		}
		if (dice5 == 2)
		{
			score = score + 2;
		}
		
		_scores[0][1] = score;
		_scores[1][1] = 1;
	}
	
	public void scoreThrees(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 3)
		{
			score = score + 3;
		}
		if (dice2 == 3)
		{
			score = score + 3;
		}
		if (dice3 == 3)
		{
			score = score + 3;
		}
		if (dice4 == 3)
		{
			score = score + 3;
		}
		if (dice5 == 3)
		{
			score = score + 3;
		}
		
		_scores[0][2] = score;
		_scores[1][2] = 1;
	}

	public void scoreFours(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 4)
		{
			score = score + 4;
		}
		if (dice2 == 4)
		{
			score = score + 4;
		}
		if (dice3 == 4)
		{
			score = score + 4;
		}
		if (dice4 == 4)
		{
			score = score + 4;
		}
		if (dice5 == 4)
		{
			score = score + 4;
		}
		
		_scores[0][3] = score;
		_scores[1][3] = 1;
	}

	public void scoreFives(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 5)
		{
			score = score + 5;
		}
		if (dice2 == 5)
		{
			score = score + 5;
		}
		if (dice3 == 5)
		{
			score = score + 5;
		}
		if (dice4 == 5)
		{
			score = score + 5;
		}
		if (dice5 == 5)
		{
			score = score + 5;
		}
		
		_scores[0][4] = score;
		_scores[1][4] = 1;
	}
	
	public void scoreSixes(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (dice1 == 6)
		{
			score = score + 6;
		}
		if (dice2 == 6)
		{
			score = score + 6;
		}
		if (dice3 == 6)
		{
			score = score + 6;
		}
		if (dice4 == 6)
		{
			score = score + 6;
		}
		if (dice5 == 6)
		{
			score = score + 6;
		}
		
		_scores[0][5] = score;
		_scores[1][5] = 1;
	}
	
	public void score3OAK(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		int oneOccurance = calculateOccurance(1, dice1, dice2, dice3, dice4, dice5);
		int twoOccurance = calculateOccurance(2, dice1, dice2, dice3, dice4, dice5);
		int threeOccurance = calculateOccurance(3, dice1, dice2, dice3, dice4, dice5);
		int fourOccurance = calculateOccurance(4, dice1, dice2, dice3, dice4, dice5);
		int fiveOccurance = calculateOccurance(5, dice1, dice2, dice3, dice4, dice5);
		int sixOccurance = calculateOccurance(6, dice1, dice2, dice3, dice4, dice5);
		
		if (oneOccurance >=3 || 
				twoOccurance >=3 || 
				threeOccurance >=3 ||
				fourOccurance >=3 || 
				fiveOccurance >=3 || 
				sixOccurance >=3)
		{
			score = dice1 + dice2 + dice3 + dice4 + dice5;
		}
		
		_scores[0][6] = score;
		_scores[1][6] = 1;
	}
	
	public void score4OAK(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		int oneOccurance = calculateOccurance(1, dice1, dice2, dice3, dice4, dice5);
		int twoOccurance = calculateOccurance(2, dice1, dice2, dice3, dice4, dice5);
		int threeOccurance = calculateOccurance(3, dice1, dice2, dice3, dice4, dice5);
		int fourOccurance = calculateOccurance(4, dice1, dice2, dice3, dice4, dice5);
		int fiveOccurance = calculateOccurance(5, dice1, dice2, dice3, dice4, dice5);
		int sixOccurance = calculateOccurance(6, dice1, dice2, dice3, dice4, dice5);
		
		if (oneOccurance >=4 || 
				twoOccurance >=4 || 
				threeOccurance >=4 ||
				fourOccurance >=4 || 
				fiveOccurance >=4 || 
				sixOccurance >=4)
		{
			score = dice1 + dice2 + dice3 + dice4 + dice5;
		}
		
		_scores[0][7] = score;
		_scores[1][7] = 1;
	}
	
	public void scoreFullHouse(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		int oneOccurance = calculateOccurance(1, dice1, dice2, dice3, dice4, dice5);
		int twoOccurance = calculateOccurance(2, dice1, dice2, dice3, dice4, dice5);
		int threeOccurance = calculateOccurance(3, dice1, dice2, dice3, dice4, dice5);
		int fourOccurance = calculateOccurance(4, dice1, dice2, dice3, dice4, dice5);
		int fiveOccurance = calculateOccurance(5, dice1, dice2, dice3, dice4, dice5);
		int sixOccurance = calculateOccurance(6, dice1, dice2, dice3, dice4, dice5);
		
		if ((oneOccurance ==3 && 
				(twoOccurance ==2 || 
				threeOccurance ==2 ||
				fourOccurance ==2 || 
				fiveOccurance ==2 || 
				sixOccurance ==2)) ||
				
				(twoOccurance ==3 && 
				(oneOccurance==2 || 
				threeOccurance ==2 ||
				fourOccurance ==2 || 
				fiveOccurance ==2 || 
				sixOccurance ==2)) ||
				
				(threeOccurance ==3 && 
				(twoOccurance ==2 || 
				oneOccurance ==2 ||
				fourOccurance ==2 || 
				fiveOccurance ==2 || 
				sixOccurance ==2)) ||
				
				(fourOccurance ==3 && 
				(twoOccurance ==2 || 
				threeOccurance ==2 ||
				oneOccurance ==2 || 
				fiveOccurance ==2 || 
				sixOccurance ==2)) ||
				
				(fiveOccurance ==3 && 
				(twoOccurance ==2 || 
				threeOccurance ==2 ||
				fourOccurance ==2 || 
				oneOccurance ==2 || 
				sixOccurance ==2)) ||
				
				(sixOccurance ==3 && 
				(twoOccurance ==2 || 
				threeOccurance ==2 ||
				fourOccurance ==2 || 
				fiveOccurance ==2 || 
				oneOccurance ==2)))
		{
			score = 25;
		}
		
		_scores[0][8] = score;
		_scores[1][8] = 1;
	}
	
	public void scoreSmStraight(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		
		//string up numbers in an int
		
		int compactedDice = dice1 + (10*dice2) + (100*dice3) + (1000*dice4) + (10000*dice5);
		
		//put into array
		
		
		Set<Integer> diceList = new HashSet<Integer>();
		
		
		for (int index = 0; index < String.valueOf(compactedDice).length(); index++)
		{
		    diceList.add((int) String.valueOf(compactedDice).charAt(index));
		}
		
		List<Integer> sortedList = new ArrayList<Integer>(diceList);
		Collections.sort(sortedList);
		
		try
		{
			if (((sortedList.get(0) == sortedList.get(1) - 1) &&
					(sortedList.get(1) == sortedList.get(2) - 1) &&
					(sortedList.get(2) == sortedList.get(3) - 1)) || 
					((sortedList.get(1) == sortedList.get(2) - 1) &&
					(sortedList.get(2) == sortedList.get(3) - 1) &&
					(sortedList.get(3) == sortedList.get(4) - 1)))
			{
				score = 30;
			}
		}
		catch (IndexOutOfBoundsException e)
		{
			
		}
		
		_scores[0][9] = score;
		_scores[1][9] = 1;
	}
	
	public void scoreLgStraight(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		
		//string up numbers in an int
		
		int compactedDice = dice1 + (10*dice2) + (100*dice3) + (1000*dice4) + (10000*dice5);
		
		//create a set to block duplicates
		
		Set<Integer> diceList = new HashSet<Integer>();
		
		for (int index = 0; index < String.valueOf(compactedDice).length(); index++)
		{
		    diceList.add((int) String.valueOf(compactedDice).charAt(index));
		}
		
		//create list to sort
		
		List<Integer> sortedList = new ArrayList<Integer>(diceList);
		Collections.sort(sortedList);
		
		try
		{
			if ((sortedList.get(0) == sortedList.get(1) - 1) &&
					(sortedList.get(1) == sortedList.get(2) - 1) &&
					(sortedList.get(2) == sortedList.get(3) - 1) &&
					(sortedList.get(3) == sortedList.get(4) - 1))
			{
				score = 40;
			}
		}
		catch (IndexOutOfBoundsException e)
		{
			
		}
		
		_scores[0][10] = score;
		_scores[1][10] = 1;
	}
	
	public void scoreYahtzee(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = 0;
		if (checkForYahtzee(dice1, dice2, dice3, dice4, dice5) == true)
		{
			score = 50;
		}
		
		_scores[0][11] = score;
		_scores[1][11] = 1;
	}
	
	public void scoreChance(int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int score = dice1 + dice2 + dice3 + dice4 + dice5;
		
		_scores[0][12] = score;
		_scores[1][12] = 1;
	}
	
	private int calculateOccurance(int num, int dice1, int dice2, int dice3, int dice4, int dice5)
	{
		int occurances = 0;
		if (dice1 == num)
		{
			occurances++;
		}
		if (dice2 == num)
		{
			occurances++;
		}
		if (dice3 == num)
		{
			occurances++;
		}
		if (dice4 == num)
		{
			occurances++;
		}
		if (dice5 == num)
		{
			occurances++;
		}
		return occurances;
	}
}
