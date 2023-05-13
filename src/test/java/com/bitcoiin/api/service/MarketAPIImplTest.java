package com.bitcoiin.api.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarketAPIImplTest {

    MarketAPIImpl target;

    @BeforeEach
    public void setUp() {
        target = new MarketAPIImpl("secret-name");
    }

    @Test
    public void testGetHighest() {
        Double result = target.getHighestBid();
        assertEquals(10.33d,result);
    }

    @Test
    public void testGetLowest() {
        Double result = target.getLowestBid();
        assertEquals(10.11d,result);
    }

    @Test
    public void testExecuteBuy() {
        Double bid = 33d;
        target.executeBuy(bid);
    }

    @Test
    public void testExecuteSell() {
        Double bid = 33d;
        target.executeSell(bid);
    }

}