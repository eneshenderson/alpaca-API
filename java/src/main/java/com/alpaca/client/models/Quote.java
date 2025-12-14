package com.alpaca.client.models;

public class Quote {
    private double askPrice;
    private int askSize;
    private double bidPrice;
    private int bidSize;
    private String timestamp;

    public double getAskPrice() { return askPrice; }
    public void setAskPrice(double askPrice) { this.askPrice = askPrice; }
    
    public int getAskSize() { return askSize; }
    public void setAskSize(int askSize) { this.askSize = askSize; }
    
    public double getBidPrice() { return bidPrice; }
    public void setBidPrice(double bidPrice) { this.bidPrice = bidPrice; }
    
    public int getBidSize() { return bidSize; }
    public void setBidSize(int bidSize) { this.bidSize = bidSize; }
    
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
