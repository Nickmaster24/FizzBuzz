package com.example.practice;

/**
 * @author nickm_000
 * @since 12/3/2015.
 */
public class FizzBuzzer {

    public static void main(String[] args) {
        FizzBuzzer testObject = new FizzBuzzer();
        testObject.classicFizzBuzz();
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
