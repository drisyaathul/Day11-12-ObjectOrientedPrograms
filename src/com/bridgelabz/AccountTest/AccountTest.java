package com.bridgelabz.AccountTest;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial Account Balance : ");
        double accountBalance = scanner.nextDouble();

        Account account = new Account(accountBalance);
        System.out.println("Enter the Debit Amount : ");
        double debitAmount = scanner.nextDouble();

        account.debitAmount(debitAmount);
        System.out.println("The Account Balance is Rs." +account.getAccountBalance());
    }
    }

