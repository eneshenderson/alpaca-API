package com.alpaca.examples;

import com.alpaca.client.*;
import com.alpaca.client.models.*;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        try {
            // Load .env
            Dotenv dotenv = Dotenv.configure()
                    .directory(".")
                    .ignoreIfMissing()
                    .load();

            String apiKey = dotenv.get("ALPACA_API_KEY");
            String apiSecret = dotenv.get("ALPACA_API_SECRET");

            if (apiKey == null || apiSecret == null) {
                System.err.println("ALPACA_API_KEY and ALPACA_API_SECRET required");
                System.exit(1);
            }

            // Initialize client
            AlpacaClient client = new AlpacaClient(apiKey, apiSecret, true);
            TradingApi trading = new TradingApi(client);
            MarketDataApi marketData = new MarketDataApi(client);

            // Account
            Account account = trading.getAccount();
            System.out.println("Buying Power: $" + account.getBuyingPower());

            // Market status
            Clock clock = trading.getClock();
            System.out.println("Market Open: " + clock.isOpen());

            // Current price
            double price = marketData.getCurrentPrice("AAPL");
            System.out.printf("AAPL: $%.2f%n", price);

            // Positions
            List<Position> positions = trading.getPositions();
            System.out.println("Positions: " + positions.size());

            System.out.println("Done!");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
