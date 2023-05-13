package com.bitcoiin.api.service;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ApplicationTest {
private Application target;

    @BeforeEach
    void setUp() {
        target  = new Application();
    }

    @Test
    public void testHandleRequest() {
        String input = "TEST_DATA";
        Context context = Mockito.mock(Context.class);
        target.handleRequest(input, context);
    }
}