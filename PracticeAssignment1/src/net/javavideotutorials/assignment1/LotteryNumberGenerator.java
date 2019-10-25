package net.javavideotutorials.assignment1;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;



public class LotteryNumberGenerator 
{
/**
 * This method should return a Set (HashSet is? add method) of 6 different
 * integers.  
 * 
 * Hint: use the 'Random' class located here: java.util.Random
 *       to generate random numbers
 * @return
 */
	
	  public Set<Integer> generateLotteryNumbers()
	  {
	  	Set<Integer> lotteryNumbers = new HashSet<>();
	  	Random rand = new Random();
	  	while(lotteryNumbers.size() != 6)
	  	    lotteryNumbers.add(rand.nextInt(49) + 1);
	  	
	  	for (Integer anInt : lotteryNumbers)
	  		 	System.out.println(anInt);
		  return lotteryNumbers;
	  }
}



