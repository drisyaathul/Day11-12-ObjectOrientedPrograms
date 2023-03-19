package com.bridgelabz.StockAccountManagement;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        System.out.println("**** Welcome to Stock Account Management ****");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Stocks : ");
        int numberOfStocks = scanner.nextInt();

       StockPortfolio stockPortfolio = new StockPortfolio();
        for (int i = 0; i<numberOfStocks; i++){
            System.out.println("Enter the Details of Stocks " + (1+i) + " :");
            System.out.println("Enter the Share Name : ");
            String shareName = scanner.next();
            System.out.println("Enter the Number of Shares : ");
            int shareNumber = scanner.nextInt();
            System.out.println("Enter the Share Price : ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(shareName,shareNumber,sharePrice);
            stockPortfolio.addStock(stock);
        }
        stockPortfolio.printReport();
    }
}