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

	public static void main( String args[] ) {
		// TODO Auto-generated method stub
	    int i, threemax, fivemax, fifteenmax, sumofthree, sumoffive, sumoffifteen;
		int three=3;
		int five=5;
		int fifteen=15;
		int upperlimit=999;
		int sumofthreesums=0;
		int sumoffivesums=0;
		int sumoffifteensums=0;
		int answer;

		threemax=upperlimit/three;
		fivemax=upperlimit/five;
		fifteenmax=upperlimit/fifteen;
		
		for (i = 0; i <= threemax; i++)
		{
			sumofthree=three*i;
			sumofthreesums=sumofthree+sumofthreesums;
			System.out.println(sumofthreesums);
		}

		for (i = 0; i <= fivemax; i++)
		{
			sumoffive=five*i;
			sumoffivesums=sumoffive+sumoffivesums;
			System.out.println(sumoffivesums);
		}
		
		for (i = 0; i <= fifteenmax; i++)
		{
			sumoffifteen=fifteen*i;
			sumoffifteensums=sumoffifteen+sumoffifteensums;
			System.out.println(sumoffifteensums);
		}
		
		answer=(sumofthreesums+sumoffivesums)-sumoffifteensums;
		System.out.println(answer);
	}

}