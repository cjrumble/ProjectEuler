/**
 * Euler Project - Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
/**
 * @author crumble
 * 28-Feb-2015
 */
public class Problem001 {

	public static void main(String args[]) {
		{
			int natural = 0; //initialize natural number sequence
			int sum = 0; //initialize running sum
		
			for(natural = 1; natural < 1000; natural++)
			{
				if(natural%3 == 0) //natural number divisable by 3?
				{
					sum += natural; //add to running sum
					continue;
				} 
				else if (natural%5 == 0) //natural number divisable by 5?
				{
					sum += natural; //add to running sum
				}
			}
			System.out.println("Solution to Euler Problem 1 = " + sum); //print final sum

		}
	}
}