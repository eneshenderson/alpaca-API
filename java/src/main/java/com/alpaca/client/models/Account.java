package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("account_number")
    private String accountNumber;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("currency")
    private String currency;
    
    @JsonProperty("buying_power")
    private String buyingPower;
    
    @JsonProperty("cash")
    private String cash;
    
    @JsonProperty("portfolio_value")
    private String portfolioValue;
    
    @JsonProperty("equity")
    private String equity;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    
    public String getBuyingPower() { return buyingPower; }
    public void setBuyingPower(String buyingPower) { this.buyingPower = buyingPower; }
    
    public String getCash() { return cash; }
    public void setCash(String cash) { this.cash = cash; }
    
    public String getPortfolioValue() { return portfolioValue; }
    public void setPortfolioValue(String portfolioValue) { this.portfolioValue = portfolioValue; }
    
    public String getEquity() { return equity; }
    public void setEquity(String equity) { this.equity = equity; }
}
