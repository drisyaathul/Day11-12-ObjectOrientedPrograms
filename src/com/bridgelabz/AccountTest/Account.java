package com.bridgelabz.AccountTest;

public class Account {

    private double accountBalance;
    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void debitAmount(double debitAmount){
        if (debitAmount > accountBalance){
            System.out.println("Debit amount exceeded account balance.");
        }else{
            accountBalance -= debitAmount;
        }
    }
}
