package com.bridgelabz.StockAccountManagement;

public class Stock {

    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfShares() {
        return numberOfShares;
    }
    public double getSharePrice() {
        return sharePrice;
    }
    public double getValue(){
        return numberOfShares * sharePrice;
    }
    @Override
    public String toString() {
        return ("name: " + name + "; Number of Shares: "+ numberOfShares + "; Share price@ $" + sharePrice + " => $" +getValue());
    }
}
