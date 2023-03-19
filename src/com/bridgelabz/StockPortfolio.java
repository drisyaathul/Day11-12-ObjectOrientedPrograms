package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

    private List<Stock>StockDetails;
    ArrayList<Stock> stockDetails = new ArrayList<>();

    public void addStock(Stock stock) {
        stockDetails.add(stock);
    }
    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stockDetails) {
            totalValue += stock.getValue();
        }
        return totalValue;
        }
    public void printReport() {
        for (Stock stock : stockDetails) {
            System.out.println(stock.toString());
        }
        System.out.println("Total Stock value: $" + getTotalValue());
        }
    }


