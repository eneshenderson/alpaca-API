package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    @JsonProperty("asset_id")
    private String assetId;
    
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("qty")
    private String qty;
    
    @JsonProperty("avg_entry_price")
    private String avgEntryPrice;
    
    @JsonProperty("market_value")
    private String marketValue;
    
    @JsonProperty("current_price")
    private String currentPrice;
    
    @JsonProperty("unrealized_pl")
    private String unrealizedPl;
    
    @JsonProperty("unrealized_plpc")
    private String unrealizedPlpc;

    public String getAssetId() { return assetId; }
    public void setAssetId(String assetId) { this.assetId = assetId; }
    
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    
    public String getQty() { return qty; }
    public void setQty(String qty) { this.qty = qty; }
    
    public String getAvgEntryPrice() { return avgEntryPrice; }
    public void setAvgEntryPrice(String avgEntryPrice) { this.avgEntryPrice = avgEntryPrice; }
    
    public String getMarketValue() { return marketValue; }
    public void setMarketValue(String marketValue) { this.marketValue = marketValue; }
    
    public String getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(String currentPrice) { this.currentPrice = currentPrice; }
    
    public String getUnrealizedPl() { return unrealizedPl; }
    public void setUnrealizedPl(String unrealizedPl) { this.unrealizedPl = unrealizedPl; }
    
    public String getUnrealizedPlpc() { return unrealizedPlpc; }
    public void setUnrealizedPlpc(String unrealizedPlpc) { this.unrealizedPlpc = unrealizedPlpc; }
}
