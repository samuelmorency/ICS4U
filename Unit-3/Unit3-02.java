/********************************************************************************
 * 
 * Created by: Sam Morency
 * Created on: November, 2016
 * This is a recursive factorial program
 *
********************************************************************************/
import java.util.Scanner;
public class Stub {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("What number would you like me to check the factorial for?");
		int input = scan.nextInt();
		int factorial = getFactorial(input);
		System.out.println("The factorial of " + input + " is " + factorial);
	}
	
	public static int getFactorial(int factorialNumber){
		if (factorialNumber > 1){
			int factorialTotal = factorialNumber * getFactorial(factorialNumber - 1);
			return factorialTotal;
		}
		return 1;
	}

}
