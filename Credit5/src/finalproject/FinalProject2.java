/*

Program: ${FinalAssignment}.java          Date: ${6/8/2022}


Author: Tarun Jaikrishnan
School: CHHS
Course: Computer Science 10
//
*/
package finalproject;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class FinalProject2 {

	public static void main(String[] args) {
		
		Instant instantStarted = Instant.now();
        Fibonacci(40);
        Instant instantStopped = Instant.now();

        Duration durationBetween = Duration.between(instantStarted, instantStopped);

        System.out.println("Get elapsed time in milliseconds: " + durationBetween.toMillis());
        System.out.println("Get elapsed time in seconds: " + durationBetween.toSeconds());
        System.out.println("Get elapsed time in minutes: " + durationBetween.toMinutes());


    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2));

	}

}
/* Screen Dump
Get elapsed time in milliseconds: 5278
Get elapsed time in seconds: 5
Get elapsed time in minutes: 0

*/
