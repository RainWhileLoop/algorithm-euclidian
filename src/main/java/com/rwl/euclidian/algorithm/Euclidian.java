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

    public static int findGCD(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("Number must not zero!!!");
        }
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        int fraction = max % min;
        showProcess(max,min);
        if (fraction != 0) {
            return findGCD(min, fraction);
        }

        return min;
    }

    private static void showProcess(int max, int min) {
        System.out.println(max + " = " + min + "(" + max / min + ") + " + max % min);
    }
}
