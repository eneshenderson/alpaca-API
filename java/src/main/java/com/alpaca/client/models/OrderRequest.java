package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequest {
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("qty")
    private String qty;
    
    @JsonProperty("notional")
    private String notional;
    
    @JsonProperty("side")
    private String side;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("time_in_force")
    private String timeInForce;
    
    @JsonProperty("limit_price")
    private String limitPrice;
    
    @JsonProperty("stop_price")
    private String stopPrice;

    public OrderRequest() {}

    public static OrderRequest market(String symbol, String qty, String side) {
        OrderRequest req = new OrderRequest();
        req.symbol = symbol;
        req.qty = qty;
        req.side = side;
        req.type = "market";
        req.timeInForce = "day";
        return req;
    }

    public static OrderRequest limit(String symbol, String qty, String side, String limitPrice) {
        OrderRequest req = new OrderRequest();
        req.symbol = symbol;
        req.qty = qty;
        req.side = side;
        req.type = "limit";
        req.limitPrice = limitPrice;
        req.timeInForce = "day";
        return req;
    }

    // Getters and setters
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    
    public String getQty() { return qty; }
    public void setQty(String qty) { this.qty = qty; }
    
    public String getNotional() { return notional; }
    public void setNotional(String notional) { this.notional = notional; }
    
    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public String getTimeInForce() { return timeInForce; }
    public void setTimeInForce(String timeInForce) { this.timeInForce = timeInForce; }
    
    public String getLimitPrice() { return limitPrice; }
    public void setLimitPrice(String limitPrice) { this.limitPrice = limitPrice; }
    
    public String getStopPrice() { return stopPrice; }
    public void setStopPrice(String stopPrice) { this.stopPrice = stopPrice; }
}
