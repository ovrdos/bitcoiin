package com.bitcoiin.api.service;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;

public class MarketAPIImpl implements MarketAPI {
    private final AWSSecretsManager secretsManager;
    private final String secretName;

    public MarketAPIImpl(String secretName) {
        this.secretsManager = AWSSecretsManagerClientBuilder.standard().build();
        this.secretName = secretName;
    }

    private String getSecret() {
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);
        GetSecretValueResult getSecretValueResult = secretsManager.getSecretValue(getSecretValueRequest);
        return getSecretValueResult.getSecretString();
    }

    @Override
    public double getHighestBid() {
        // Connect to the API using the secret (API key) obtained from AWS Secrets Manager
        // Fetch the highest bid and return it
	return 10.33d;
    }

    @Override
    public double getLowestBid() {
        // Connect to the API using the secret (API key) obtained from AWS Secrets Manager
        // Fetch the lowest bid and return it
	return 10.11d;
    }

    @Override
    public void executeBuy(double bid) {
        // Connect to the API using the secret (API key) obtained from AWS Secrets Manager
        // Execute a buy order at the specified bid
    }

    @Override
    public void executeSell(double bid) {
        // Connect to the API using the secret (API key) obtained from AWS Secrets Manager
        // Execute a sell order at the specified bid
    }
}

