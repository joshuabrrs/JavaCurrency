import java.util.Scanner;

/************************************************************************
 * File Name: Expressions1.java
 * 
 * Due Date: 10/18/18
 * 
 * Author: Joshua Barrios
 * 
 * Program Description: This program is designed to calculate the given formula
 * in the pdf file
 * 
 * Program Input: none Program Output: the total sum of expression Program
 * Processing:
 * 
 **********************************************************************/

public class Expressions1 {
    public static void main(String[] args) {
        double x = 5;
        double n = 2;
        double firstSeg = (1 + x);
        // add later to formula
        double firstSegPow = Math.pow(firstSeg, n);
        double secondSeg = firstSegPow + (n * x);
        double thirdSeg = (n * (n - 1) * Math.pow(x, 2)) / 2;
        double total = secondSeg + thirdSeg;
        System.out.println("The result of the expression is " + total);
    }
}