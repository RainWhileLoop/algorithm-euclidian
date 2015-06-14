/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.euclidian.algorithm;

/**
 *
 * @author RainWhileLoop
 */
public class Euclidian {

    /**
     * Calculated the GCD of 2 numbers by using Euclidian Algorithm
     *
     * @param num1 must not be 0
     * @param num2 must not be 0
     * @return GCD - greatest common divisor
     */
    public static int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        int dividend = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);

        int fraction = dividend % divisor;

        if (fraction != 0) {
            return findGCD(divisor, fraction);
        }
        return divisor;
    }

    private static void showProcess(int max, int min) {
        System.out.println(max + " = " + min + "(" + max / min + ") + " + max % min);
    }
}
