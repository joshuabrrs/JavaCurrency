/*******************************************************************************
 * 
 * File Name:   Barrios_Lesson5.java   
 * 
 * Due Date:    11/02/18
 * 
 * Author:      Joshua Barrios
 * 
 * Program Description:  
 *              This program is designed to take in user input from to convert US dollars to any currency selected
 * 
 * Program Input:         
 *              US money amount, choice of currency to convert
 *  
 * Program Output:                   
 *              total result of converting the money
 * Program Processing:           
 *    
 * 
 * Online Currency Converter Example:  https://www.oanda.com/currency/converter/
 * ****************************************************************************/

//Import Scanner class
import java.util.Scanner;

public class Barrios_Lesson5 {

    public static void main(String[] args) {
        // initiallzing variables
        int choice;
        double usAmount;
        double result;
        // countries
        final double AUD = 1.40885;
        final double XBT = 0.00015;
        final double GBP = 0.76826;
        final double CAD = 1.30976;
        final double CNY = 6.93780;
        final double DKK = 6.49079;
        final double EUR = 0.87007;
        final double HKD = 7.83955;
        final double IRR = 4200;
        final double NGN = 361.969;
        // menu print
        System.out.println("********************************************************************");
        System.out.println("                        THE CURRENCY CALCULATOR              ");
        System.out.println("********************************************************************");
        System.out.println(" ");
        System.out.print("How many United States Dollars (USD) would you like to convert? $");
        Scanner sc = new Scanner(System.in);
        usAmount = sc.nextDouble();
        // store user answer
        System.out.println(" ");
        System.out.println("Global Currency List:");
        System.out.println("1 - Australian Dollar (AUD)");
        System.out.println("2 - Bitcon (XBT)");
        System.out.println("3 - British Pound (GBP)");
        System.out.println("4 - Canadian Dollar (CAD)");
        System.out.println("5 - Chinese Yuan Renminbi (CNY)");
        System.out.println("6 - Danish Krone (DKK)");
        System.out.println("7 - Euro (EUR)");
        System.out.println("8 - Hong Kong Dollar (HKD)");
        System.out.println("9 - Iranian Rial (IRR)");
        System.out.println("10 - Nigerian Naira (NGN)");
        System.out.println(" ");
        System.out.print("What global currency would you like to convert to? ");
        Scanner sc2 = new Scanner(System.in);
        choice = sc2.nextInt();
        // stored user choice
        System.out.println(" ");
        // if statements to check for user answer and make math to convert to desired
        // choice
        if (choice == 1) {
            System.out.println("********************************************************************");
            result = usAmount * AUD;
            System.out.println("                    USD:  $" + usAmount + " to  AUD:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 2) {
            System.out.println("********************************************************************");
            result = usAmount * XBT;
            System.out.println("                    USD:  $" + usAmount + " to  XBT:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 3) {
            System.out.println("********************************************************************");
            result = usAmount * GBP;
            System.out.println("                    USD:  $" + usAmount + " to  GBP:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 4) {
            System.out.println("********************************************************************");
            result = usAmount * CAD;
            System.out.println("                    USD:  $" + usAmount + " to  CAD:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 5) {
            System.out.println("********************************************************************");
            result = usAmount * CNY;
            System.out.println("                    USD:  $" + usAmount + " to  CNY:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 6) {
            System.out.println("********************************************************************");
            result = usAmount * DKK;
            System.out.println("                    USD:  $" + usAmount + " to  DKK:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 7) {
            System.out.println("********************************************************************");
            result = usAmount * EUR;
            System.out.println("                    USD:  $" + usAmount + " to  EUR:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 8) {
            System.out.println("********************************************************************");
            result = usAmount * HKD;
            System.out.println("                    USD:  $" + usAmount + " to  HKD:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 9) {
            System.out.println("********************************************************************");
            result = usAmount * IRR;
            System.out.println("                    USD:  $" + usAmount + " to  IRR:  $" + result);
            System.out.println("********************************************************************");
        } else if (choice == 10) {
            System.out.println("********************************************************************");
            result = usAmount * NGN;
            System.out.println("                    USD:  $" + usAmount + " to  NGN:  $" + result);
            System.out.println("********************************************************************");
        } else {
            System.out.println("You have entered an invalid menu choice! Goodbye!!");
        }
    }// end of main

}// end of class
