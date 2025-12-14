package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("client_order_id")
    private String clientOrderId;
    
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("qty")
    private String qty;
    
    @JsonProperty("filled_qty")
    private String filledQty;
    
    @JsonProperty("side")
    private String side;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("time_in_force")
    private String timeInForce;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("limit_price")
    private String limitPrice;
    
    @JsonProperty("stop_price")
    private String stopPrice;
    
    @JsonProperty("filled_avg_price")
    private String filledAvgPrice;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getClientOrderId() { return clientOrderId; }
    public void setClientOrderId(String clientOrderId) { this.clientOrderId = clientOrderId; }
    
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    
    public String getQty() { return qty; }
    public void setQty(String qty) { this.qty = qty; }
    
    public String getFilledQty() { return filledQty; }
    public void setFilledQty(String filledQty) { this.filledQty = filledQty; }
    
    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public String getTimeInForce() { return timeInForce; }
    public void setTimeInForce(String timeInForce) { this.timeInForce = timeInForce; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getLimitPrice() { return limitPrice; }
    public void setLimitPrice(String limitPrice) { this.limitPrice = limitPrice; }
    
    public String getStopPrice() { return stopPrice; }
    public void setStopPrice(String stopPrice) { this.stopPrice = stopPrice; }
    
    public String getFilledAvgPrice() { return filledAvgPrice; }
    public void setFilledAvgPrice(String filledAvgPrice) { this.filledAvgPrice = filledAvgPrice; }
}
