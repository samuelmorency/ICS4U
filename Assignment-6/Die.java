/********************************************************************************
 * 
 * Created by: Sam Morency
 * Created on: November 2016
 * This is a dice class
 *
********************************************************************************/

import java.util.Random;

public class Die {
	//properties
	private int _numofsides = 6;
	//side facing up
	private int _topSide;
	
	//constructor
	public Die(int sideFacingUp)
	{
		_topSide = sideFacingUp;
	}
	
	//roll die, returns new top side 
	public void rollDie()
	{
		Random dieRandom = new Random();
		int newNumber;
		
		newNumber = dieRandom.nextInt(_numofsides) + 1;
		
		_topSide = newNumber;
		
	}
	
	//return the value of the side facing up
	public int getTopSide()
	{
		return _topSide;
	}
	
	//return string value of side facing up
	public String getTopSideStr()
	{
		return Integer.toString(_topSide);
	}
}
