package com.trading.algo.controller;

import com.trading.algo.controller.TradingController;
import com.trading.algo.service.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TradingControllerTest {
    @Mock
    Application app;
    @InjectMocks
    TradingController controller;
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testHandleSignal() {
        int signal = 1;
        controller.handleSignal(signal);
        Mockito.verify(app).handleSignal(signal);
    }
}

