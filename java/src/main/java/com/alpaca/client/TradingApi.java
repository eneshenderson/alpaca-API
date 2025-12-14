package com.alpaca.client;

import com.alpaca.client.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.util.List;

public class TradingApi {
    private final AlpacaClient client;
    private final ObjectMapper mapper;

    public TradingApi(AlpacaClient client) {
        this.client = client;
        this.mapper = new ObjectMapper();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public Account getAccount() throws Exception {
        String response = client.get("/v2/account");
        return mapper.readValue(response, Account.class);
    }

    public Clock getClock() throws Exception {
        String response = client.get("/v2/clock");
        return mapper.readValue(response, Clock.class);
    }

    public List<Position> getPositions() throws Exception {
        String response = client.get("/v2/positions");
        return mapper.readValue(response, 
            mapper.getTypeFactory().constructCollectionType(List.class, Position.class));
    }

    public List<Order> getOrders() throws Exception {
        String response = client.get("/v2/orders");
        return mapper.readValue(response, 
            mapper.getTypeFactory().constructCollectionType(List.class, Order.class));
    }

    public Order submitOrder(OrderRequest request) throws Exception {
        String body = mapper.writeValueAsString(request);
        String response = client.post("/v2/orders", body);
        return mapper.readValue(response, Order.class);
    }

    public void cancelOrder(String orderId) throws Exception {
        client.delete("/v2/orders/" + orderId);
    }

    public void cancelAllOrders() throws Exception {
        client.delete("/v2/orders");
    }
}
