package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snapshot {
    @JsonProperty("latestTrade")
    private SnapshotTrade latestTrade;
    
    @JsonProperty("latestQuote")
    private SnapshotQuote latestQuote;
    
    @JsonProperty("dailyBar")
    private Bar dailyBar;

    public SnapshotTrade getLatestTrade() { return latestTrade; }
    public void setLatestTrade(SnapshotTrade latestTrade) { this.latestTrade = latestTrade; }
    
    public SnapshotQuote getLatestQuote() { return latestQuote; }
    public void setLatestQuote(SnapshotQuote latestQuote) { this.latestQuote = latestQuote; }
    
    public Bar getDailyBar() { return dailyBar; }
    public void setDailyBar(Bar dailyBar) { this.dailyBar = dailyBar; }

    public static class SnapshotTrade {
        @JsonProperty("p")
        private double price;
        @JsonProperty("s")
        private int size;
        @JsonProperty("t")
        private String timestamp;

        public double getPrice() { return price; }
        public int getSize() { return size; }
        public String getTimestamp() { return timestamp; }
    }

    public static class SnapshotQuote {
        @JsonProperty("ap")
        private double askPrice;
        @JsonProperty("as")
        private int askSize;
        @JsonProperty("bp")
        private double bidPrice;
        @JsonProperty("bs")
        private int bidSize;

        public double getAskPrice() { return askPrice; }
        public int getAskSize() { return askSize; }
        public double getBidPrice() { return bidPrice; }
        public int getBidSize() { return bidSize; }
    }

    public static class Bar {
        @JsonProperty("o")
        private double open;
        @JsonProperty("h")
        private double high;
        @JsonProperty("l")
        private double low;
        @JsonProperty("c")
        private double close;
        @JsonProperty("v")
        private long volume;

        public double getOpen() { return open; }
        public double getHigh() { return high; }
        public double getLow() { return low; }
        public double getClose() { return close; }
        public long getVolume() { return volume; }
    }
}
