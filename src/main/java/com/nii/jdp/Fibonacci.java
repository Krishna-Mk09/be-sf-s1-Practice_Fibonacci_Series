package com.nii.jdp;

/**
 * The Fibonacci class has a main method that creates a new Fibonacci object and calls the printFibonacciSeries method on
 * that object
 */
public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(10);
    }

    /**
     * It returns the nth number in the Fibonacci series
     *
     * @param number The number of the Fibonacci series to be returned.
     * @return The nth number in the Fibonacci sequence.
     */
    public long fibonacciSeries(long number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
    }

    /**
     * Prints the Fibonacci series up to the number passed as an argument.
     *
     * @param number The number of elements in the Fibonacci series.
     */
    public void printFibonacciSeries(long number) {
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacciSeries(i) + "");
        }
    }
}
