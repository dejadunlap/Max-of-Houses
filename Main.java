/***
*@Author: Deja Dunlap
*@Date: March 3, 2021
*@ There are N houses for sale. The i-th house costs A dollars to buy. You have a budget of B dollars to spend. Finds the maximum number of houses you can buy
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //creates Scanner
    Scanner in = new Scanner(System.in); 

    //takes in the number of list you would like to create
    int numCases = Integer.parseInt(in.nextLine()); 
    int caseTested = 0; 
    int[] caseAnswers = new int[numCases];

    while (caseTested < numCases) {
      //Enter the num of houses and budget splits stats into String Array and converts them into int variables
      String caseStats = in.nextLine();
      String[] caseStatsArray = caseStats.split(" ");
      int numOfHouses = Integer.parseInt(caseStatsArray[0]);
      int budget = Integer.parseInt(caseStatsArray[1]);

      //Enter the cost of each house and splits them into string Array and converts them into int variables
      String houseStats = in.nextLine();
      String[] houseStatsArray = houseStats.split(" ");
      int[] houseStatsInt = new int[houseStatsArray.length];
      for (int i = 0; i < houseStatsArray.length; i++){
        houseStatsInt[i] = Integer.parseInt(houseStatsArray[i]);
      }//ends for loop


      // test the max number of houses you can buy due to your budget
      int maxHouses = 0; 
      for (int i = 0; i < houseStatsInt.length; i++){
        int currentAmount = 0;
        int currentHouses = 0;
        for (int j = i; j < houseStatsInt.length; j++){
          if (currentAmount + houseStatsInt[j] <= budget){
            currentAmount += houseStatsInt[j];
            currentHouses++;
          } //ends if
          if (currentHouses > maxHouses){
            maxHouses = currentHouses; 
          } // ends if
        }// ends inner for loop
      }// ends outer for loop

      caseAnswers[caseTested] = maxHouses;
      caseTested++;
    }// end of while

    //prints out the cases
    for (int i = 0; i < caseAnswers.length; i++){
      System.out.println("Case #" + (i+1) + ": " + caseAnswers[i]);
    }

    //closes the scanner
    in.close();
    }// end of main method
  }// end of main class

