/******************************************************************************
 *
 * Created by: Sam Morency
 * Created on: September 18th, 2016
 * This program finds the longest run of characters in a String
 *
******************************************************************************/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	System.out.println("What is your string?");
    Scanner scanner = new Scanner(System.in);  // Reading from System.in
	String givenString = scanner.nextLine(); // Scans the next token of the input as a string.
	int longestRun = maxBlock(givenString);
	System.out.println("The longest run of characters is " + longestRun);
  }

static int maxBlock(String str) {
      int maxRun = 0;
      int currentRun = 1;
      if(str.length() == 0){ //If string is empty return 0
         maxRun = 0;
      } else if(str.length() == 1){ //If string contains only a single char return 1
         maxRun = 1;
      } else {
          for(int characterCounter=0; characterCounter < str.length()-1; characterCounter++){   //loop through each char value
              if((str.length() == 2) && (str.charAt(characterCounter) != str.charAt(characterCounter+1))){ 
                  maxRun =1; //return 1 if the length of the string is 2 and non of the two chars match
              }   
              else if((str.length() == 3) && (str.charAt(characterCounter) != str.charAt(characterCounter+1))){
                 maxRun = 1; //return 1 if the length of the string is 3 and non of the three chars match
              } 
              else if (str.charAt(characterCounter) == str.charAt(characterCounter+1)){
                 currentRun = currentRun + 1; 
                   if(currentRun > maxRun){
                     maxRun = currentRun; //update the value of maxRun if currentRun is larger
                     }
             } else currentRun = 1; 
          }
      }
      return maxRun;
    }
}
