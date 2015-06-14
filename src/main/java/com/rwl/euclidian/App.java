/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwl.euclidian;

import com.rwl.euclidian.algorithm.Euclidian;
import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1, number2, result;

        System.out.println("Find Greatest Common Divisor (GCD) by using euclidian algorithm");
        System.out.print("Input number1 : ");
        number1 = scanner.nextInt();
        System.out.print("Input number2 : ");
        number2 = scanner.nextInt();
        
        double startTime = System.nanoTime();
        result = Euclidian.findGCD(number1, number2);
        double endTime = System.nanoTime()- startTime;
        
        System.out.println("\nGCD of " + number1 + " and " + number2 + " = " + result);
        System.out.println("\nProcess time : " + endTime/1000000f + " ms");
    }

}
