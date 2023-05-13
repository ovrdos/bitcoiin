package com.bitcoiin.api.service;

public interface MarketAPI {
    double getHighestBid();
    double getLowestBid();
    void executeBuy(double bid);
    void executeSell(double bid);
}
