package epam;

import java.util.stream.IntStream;

public class Checking_if_a_Number_is_prime_using_streams {

	public static void main(String[] args) {

		int number =17;
		boolean isPrime = isPrime(number);
		System.out.println(number + (isPrime ? " is a Prime Number" : " is not a Prime Number"));
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(i -> number%i ==0);
	}

}
