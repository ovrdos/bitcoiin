package com.bitcoiin.api.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MarketAPIFactoryTest {
    @Test
    void getAPI() {
        assertNotNull(MarketAPIFactory.getAPI("NEW_API"));
    }
}