package com.alpaca.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clock {
    @JsonProperty("timestamp")
    private String timestamp;
    
    @JsonProperty("is_open")
    private boolean isOpen;
    
    @JsonProperty("next_open")
    private String nextOpen;
    
    @JsonProperty("next_close")
    private String nextClose;

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
    
    public boolean isOpen() { return isOpen; }
    public void setOpen(boolean open) { isOpen = open; }
    
    public String getNextOpen() { return nextOpen; }
    public void setNextOpen(String nextOpen) { this.nextOpen = nextOpen; }
    
    public String getNextClose() { return nextClose; }
    public void setNextClose(String nextClose) { this.nextClose = nextClose; }
}
