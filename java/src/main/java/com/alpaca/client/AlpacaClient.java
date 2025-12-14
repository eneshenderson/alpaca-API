package com.alpaca.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class AlpacaClient {
    private static final String TRADING_LIVE = "https://api.alpaca.markets";
    private static final String TRADING_PAPER = "https://paper-api.alpaca.markets";
    private static final String MARKET_DATA = "https://data.alpaca.markets";

    private final String apiKey;
    private final String apiSecret;
    private final String baseUrl;
    private final HttpClient client;

    public AlpacaClient(String apiKey, String apiSecret, boolean paper) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.baseUrl = paper ? TRADING_PAPER : TRADING_LIVE;
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(30))
                .build();
    }

    public String get(String endpoint) throws Exception {
        return request("GET", endpoint, null, baseUrl);
    }

    public String get(String endpoint, String customBaseUrl) throws Exception {
        return request("GET", endpoint, null, customBaseUrl);
    }

    public String post(String endpoint, String body) throws Exception {
        return request("POST", endpoint, body, baseUrl);
    }

    public String delete(String endpoint) throws Exception {
        return request("DELETE", endpoint, null, baseUrl);
    }

    private String request(String method, String endpoint, String body, String base) throws Exception {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(base + endpoint))
                .header("APCA-API-KEY-ID", apiKey)
                .header("APCA-API-SECRET-KEY", apiSecret)
                .header("Content-Type", "application/json")
                .timeout(Duration.ofSeconds(30));

        if ("POST".equals(method) && body != null) {
            builder.POST(HttpRequest.BodyPublishers.ofString(body));
        } else if ("DELETE".equals(method)) {
            builder.DELETE();
        } else {
            builder.GET();
        }

        HttpResponse<String> response = client.send(builder.build(), HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() >= 400) {
            throw new RuntimeException("API Error " + response.statusCode() + ": " + response.body());
        }

        return response.body();
    }

    public String getMarketDataUrl() {
        return MARKET_DATA;
    }
}
