package fr.panicot.exercises.fizzbuzz;

/**
 * Created by William on 01/08/2017.
 * Outputs every number from 1 to 100 except:
 * - if a number is divisible by 3, output Fizz instead
 * - if a number is divisible by 5, output Buzz instead²
 * - if a number is divisible by both, output FizzBuzz
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if(i % 3 == 0) {
                output = output + "Fizz";
            }
            if(i % 5 == 0) {
                output = output + "Buzz";
            }
            if(output.isEmpty()) {
                output = output + i;
            }
            System.out.println(output);
        }
    }
}
