package com.example.fizzbuzz;

/**
 * @author nickm_000
 * @since 12/3/2015.
 */
public class FizzBuzzer {

    public static void main(String[] args) {
        FizzBuzzer testObject = new FizzBuzzer();
        testObject.classicFizzBuzz();
        testObject.alternateFizzBuzz();
        testObject.variableFizzBuzz(1, 100, 3, 5);
        testObject.variableFizzBuzz(-30, 30, 2, 5);
    }

    public FizzBuzzer() {

    }

    public void classicFizzBuzz() {
        for (int i = 1; i < 101; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                result = Integer.toString(i);
            }
            System.out.println(result);
        }
    }

    public void alternateFizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void variableFizzBuzz(int start, int end, int fizz, int buzz) {
        for (int i = start; i < end + 1; i++) {
            String result = "";
            if (i % fizz == 0) {
                result = "Fizz";
            }
            if (i % buzz == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                result = Integer.toString(i);
            }
            System.out.println(result);
        }
    }
}
