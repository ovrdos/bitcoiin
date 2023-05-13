package com.bitcoiin.api.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MarketTest {

    @Mock
    MarketAPI api;

    @InjectMocks
    Market target;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testGetHighestBid() {
        Mockito.when(api.getHighestBid()).thenReturn(44.44d);
        double result = target.getHighestBid();
        assertEquals(44.44d, result);
    }

    @Test
    public void testGetLowestBid() {
        Mockito.when(api.getLowestBid()).thenReturn(44.42d);
        double result = target.getLowestBid();
        assertEquals(44.42d, result);
    }

    @Test
    public void testExecuteBuy() {
        Double bidAmount = 33.33d;

        target.executeBuy(bidAmount);

        Mockito.verify(api).executeBuy(bidAmount);
    }

    @Test
    public void testExecuteSell() {
        Double bidAmount = 33.33d;

        target.executeSell(bidAmount);

        Mockito.verify(api).executeSell(bidAmount);
    }
}