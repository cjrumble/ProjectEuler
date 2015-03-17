/**
 * Euler Project - Problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
/**
 * @author crumble
 * 27-Feb-2015
 */
public class Problem003 {
	 public static void main(String[] args) {

	        long number = 600851475143L; //Number supplied by the problem
	        long currentPrime = 1; //initialize currentPrime

	        while (number > 1) {
	            currentPrime = nextPrime(currentPrime);
	            if (number % currentPrime == 0)
	                number /= currentPrime;
	        }
	        System.out.println("Solution to Euler Problem 3 = " + (currentPrime));

	    }

	    public static boolean isPrime(long n) { //check if number is prime
	        for (long i = 2; i < n; i++)
	            if (n % i == 0) return false;
	        return true;
	    }

	    public static long nextPrime(long n) { //get next prime
	        for (long i = n + 1; ; i++) {
	            if (isPrime(i)) return i;
	        }
	    }

	}