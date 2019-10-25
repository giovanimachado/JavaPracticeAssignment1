package net.javavideotutorials.assignment1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker 
{

  /**
   * This method should pull input from the user in the console.  It should
   * gather 6 Integers from the user and then store these numbers in a Set of
   * Integers that will then be returned by the method.
   * 
   * Hint: use the following code to get numbers:
   * 
   * Scanner in = new Scanner(System.in);
   * in.nextInt();
   * 
   * @return Set of 6 numbers that were chosen by the user
   * @throws IOException
   */
  public Set<Integer> promptUserForLotteryNumbers () throws IOException
  {
  	Set<Integer> userNumbers = new HashSet<>();
		Scanner in = new Scanner(System.in);
  	while(userNumbers.size() != 6)
  	  userNumbers.add(in.nextInt());
  	
  	for (Integer anInt : userNumbers)
		 	System.out.print(anInt);
    return userNumbers;
   
  }
}
