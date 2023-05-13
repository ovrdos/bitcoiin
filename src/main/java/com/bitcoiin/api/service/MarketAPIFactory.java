package com.bitcoiin.api.service;

import java.util.HashMap;
import java.util.Map;

public class MarketAPIFactory {
    private static final Map<String, MarketAPI> apis = new HashMap<>();

    public static MarketAPI getAPI(String secretName) {
        return apis.computeIfAbsent(secretName, k -> new MarketAPIImpl(secretName));
    }
}

