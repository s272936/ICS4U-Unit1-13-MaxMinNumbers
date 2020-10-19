// import 
import java.util.Arrays;  
import java.util.Random;

/**
 * Class Max Min Numbers.
* This program generates 10 random number
* between 1 and 99 and returns them
* shows min and max numbers

* @author  Linh Ho
* @version 1.0
* @since   2020-09-26
*/

public class MinMaxNumbers {
  
  /**
    * Required javadoc.
  */
  
  public static int findMinNum(int[] arrayNum) {
    
    // set min num to the the array
    int minNum = arrayNum[0];
    
    // loop through until index is higher than 10, find min num
    for (int index = 1; index < arrayNum.length; index++) {
      // compare and find min num
      if (minNum > arrayNum[index]) {
        minNum = arrayNum[index];
      }
    }
    
    return minNum;
    
  }
  
  /**
    * Required javadoc.
  */
  
  public static int findMaxNum(int[] arrayNum) {
    
    // set max num to the the array
    int maxNum = arrayNum[0];
    
    // loop through until index is higher than 10, find max num
    for (int i = 1; i < arrayNum.length; i++) {
      // compare and find max num
      if (maxNum < arrayNum[i]) {
        maxNum = arrayNum[i];
      }
    }
    
    return maxNum;
  }
  
  /**
    * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // declare variables
    int maxRanNum = 99;
    int randomNumber;
    
    // create a list, fill it up to the array size
    int[] arrayNum = new int[10];
    
    // create random
    Random randomNumberGenerator = new Random();
    
    // loop through and populate array
    for (int counter = 0; counter < arrayNum.length; counter++) {
      // generate random number between 1 and 99
      randomNumber = randomNumberGenerator.nextInt(maxRanNum + 1);
      
      // random number is assigned to the cell at position counter
      arrayNum[counter] = randomNumber;
      
      // display array with nums
      System.out.println(arrayNum[counter]);
    }
    
    // call findMinNum function
    int minNum = findMinNum(arrayNum);
    
    // call findMaxNum function
    int maxNum = findMaxNum(arrayNum);
    
    // print max num
    System.out.println("The minimum number: " + minNum);
    
    // print max num
    System.out.println("The maximum number: " + maxNum);
  }
}