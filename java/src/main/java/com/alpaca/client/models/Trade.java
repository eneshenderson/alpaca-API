package com.alpaca.client.models;

public class Trade {
    private double price;
    private int size;
    private String timestamp;

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }
    
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
