package com.bitcoiin.api.service;

public class Market {
    private final MarketAPI api;

    public Market(MarketAPI api) {
        this.api = api;
    }

    public double getHighestBid() {
        return api.getHighestBid();
    }

    public double getLowestBid() {
        return api.getLowestBid();
    }

    public void executeBuy(double bid) {
        api.executeBuy(bid);
    }

    public void executeSell(double bid) {
        api.executeSell(bid);
    }
}

