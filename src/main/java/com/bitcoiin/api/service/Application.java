package com.bitcoiin.api.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Arrays;
import java.util.List;

public class Application implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        List<Market> markets = Arrays.asList(
                new Market(MarketAPIFactory.getAPI("api1-secret-name")),
                new Market(MarketAPIFactory.getAPI("api2-secret-name"))
                // add more markets as necessary
        );

        double lowestBid = Double.MAX_VALUE;
        double highestBid = Double.MIN_VALUE;

        for (Market market : markets) {
            double highestMarketBid = market.getHighestBid();
            double lowestMarketBid = market.getLowestBid();

            if (highestMarketBid > highestBid) {
                highestBid = highestMarketBid;
            }

            if (lowestMarketBid < lowestBid) {
                lowestBid = lowestMarketBid;
            }
        }

        for (Market market : markets) {
            market.executeBuy(lowestBid);
            market.executeSell(highestBid);
        }

        return "Buy and Sell operations executed successfully!";
    }
}

