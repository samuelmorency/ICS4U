/******************************************************************************
 *
 * Created by: Sam Morency
 * Created on: October 1st, 2016
 * This is a rock paper scissors program
 *
******************************************************************************/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  	String compPlay = "nil";
  	String result = "nil";
  	Random compRandom = new Random(); // Computer chooses rock paper or scissors
    int  compInteger = compRandom.nextInt(3) + 1;
    if (compInteger == 1)
    	{
    		compPlay = "Rock";
    	}
    else if (compInteger == 2)
    	{
    		compPlay = "Paper";
    	}
    else
    	{
    		compPlay = "Scissors";
    	}
    System.out.println("Rock (1), Paper(2), or Scissors(3)?");
	Scanner scanner = new Scanner(System.in);  // Reading from System.in
    int userPlay = scanner.nextInt(); // Scans the next token of the input as an int.
    if (compInteger == (userPlay - 1) | compInteger == (userPlay + 2))
    	{
    		result = "win";
    	}
    else if (userPlay == compInteger)
    	{
    		result = "tie";
    	}
    	
    else
    	{
    		result = "lose";
    	}
    System.out.println("Computer played " + compPlay + ", you " + result);
  }
}
