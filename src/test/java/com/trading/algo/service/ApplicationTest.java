package com.trading.algo.service;

import static org.mockito.Mockito.*;

import com.trading.algo.lib.Algo;
import com.trading.algo.strategy.SignalStrategy;
import org.junit.Test;


public class ApplicationTest {
    @Test
    public void testHandleSignal() {

        // create mock objects
        Algo algo = mock(Algo.class);
        SignalStrategy strategy = mock(SignalStrategy.class);
        SignalStrategyFactory factory = mock(SignalStrategyFactory.class);

        // specify behavior of mock objects
        when(factory.getStrategy(anyInt())).thenReturn(strategy);

        // create object of the class under test
        Application application = new Application();

        // call the method under test
        application.handleSignal(123);

        // verify that mock objects were called as expected
        verify(factory).getStrategy(123);
        verify(strategy).executeSignal(algo);
        verify(algo).doAlgo();
    }
}

