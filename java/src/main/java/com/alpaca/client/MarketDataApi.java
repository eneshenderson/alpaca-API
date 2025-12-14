package com.alpaca.client;

import com.alpaca.client.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;

public class MarketDataApi {
    private final AlpacaClient client;
    private final ObjectMapper mapper;

    public MarketDataApi(AlpacaClient client) {
        this.client = client;
        this.mapper = new ObjectMapper();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public double getCurrentPrice(String symbol) throws Exception {
        String response = client.get("/v2/stocks/" + symbol + "/trades/latest", client.getMarketDataUrl());
        JsonNode root = mapper.readTree(response);
        return root.path("trade").path("p").asDouble();
    }

    public Quote getLatestQuote(String symbol) throws Exception {
        String response = client.get("/v2/stocks/" + symbol + "/quotes/latest", client.getMarketDataUrl());
        JsonNode root = mapper.readTree(response);
        JsonNode quoteNode = root.path("quote");
        
        Quote quote = new Quote();
        quote.setAskPrice(quoteNode.path("ap").asDouble());
        quote.setAskSize(quoteNode.path("as").asInt());
        quote.setBidPrice(quoteNode.path("bp").asDouble());
        quote.setBidSize(quoteNode.path("bs").asInt());
        quote.setTimestamp(quoteNode.path("t").asText());
        return quote;
    }

    public Trade getLatestTrade(String symbol) throws Exception {
        String response = client.get("/v2/stocks/" + symbol + "/trades/latest", client.getMarketDataUrl());
        JsonNode root = mapper.readTree(response);
        JsonNode tradeNode = root.path("trade");
        
        Trade trade = new Trade();
        trade.setPrice(tradeNode.path("p").asDouble());
        trade.setSize(tradeNode.path("s").asInt());
        trade.setTimestamp(tradeNode.path("t").asText());
        return trade;
    }

    public Snapshot getSnapshot(String symbol) throws Exception {
        String response = client.get("/v2/stocks/" + symbol + "/snapshot", client.getMarketDataUrl());
        return mapper.readValue(response, Snapshot.class);
    }
}
