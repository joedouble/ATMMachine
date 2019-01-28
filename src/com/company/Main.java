package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double accountBalance = 3000;
        int PIN = 0;
        boolean userContinue = false;
        int userChoice = 0;
        double transaction = 0;

        System.out.println("Welcome to the Fyre Festival ATM Machine!");

        System.out.println("Please enter your 4 digit PIN to proceed:");
        PIN = myScanner.nextInt();

        if (PIN == 1234) {
            do {
                System.out.println("What would you like to do to do today?\n1) Check your account balance.\n2) Withdraw funds." +
                        "\n3) Deposit Funds");
                userChoice = myScanner.nextInt();

                if (userChoice == 1) {
                    System.out.println("Your current account balance is: " + accountBalance);
                } else if (userChoice == 2) {
                    System.out.println("How much would you like to withdraw from your account?");
                    transaction = myScanner.nextInt();
                    accountBalance -= transaction;
                    System.out.println("Your new account balance is: " + accountBalance);
                } else if (userChoice == 3) {
                    System.out.println("How much would you like to deposit into your account?");
                    transaction = myScanner.nextInt();
                    accountBalance += transaction;
                    System.out.println("Your new account balance is: " + accountBalance);
                } else {
                    System.out.println("Please make another selection.");
                }

                System.out.println("Would you like to make another transaction?\n1) Yes\n2) No");
                userChoice = myScanner.nextInt();

                if (userChoice == 1) {
                    userContinue = true;
                } else {
                    userContinue = false;
                }

            } while (userContinue);
        } else {
            System.out.println("You've entered the wrong PIN.");
        }
    }
}