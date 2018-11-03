import java.util.Scanner;

/************************************************************************
 * File Name: Expressions2.java
 * 
 * Due Date: 10/18/18
 * 
 * Author: Joshua Barrios
 * 
 * Program Description: This program is designed to calculate the given formula
 * in the pdf file
 * 
 * Program Input: x and n
 * 
 * Program Output: the total sum of expression Program
 * 
 * Processing:
 * 
 **********************************************************************/

public class Expressions2 {
    public static void main(String[] args) {
        double x, n;
        System.out.println("What is x?");
        Scanner answer1 = new Scanner(System.in);
        x = answer1.nextDouble();
        System.out.println("What is n?");
        Scanner answer2 = new Scanner(System.in);
        n = answer2.nextDouble();
        double firstSeg = (1 + x);
        // add later to formula
        double firstSegPow = Math.pow(firstSeg, n);
        double secondSeg = firstSegPow + (n * x);
        double thirdSeg = (n * (n - 1) * Math.pow(x, 2)) / 2;
        double total = secondSeg + thirdSeg;
        System.out.println("The result of the expression is " + total);
    }
}