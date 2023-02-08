package com.trading.algo.service;

import com.trading.algo.strategy.SignalStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class SignalStrategyFactoryTest {
    @Spy
    private SignalStrategyFactory spySignalStrategyFactory;

    @Test
    public void testGetStrategy_validSignal() throws Exception {
        int signal = 123;
        SignalStrategy mockSignalStrategy = spy(SignalStrategy.class);

        doReturn(new HashMap<Integer, SignalStrategy>() {{
            put(signal, mockSignalStrategy);
        }}).when(spySignalStrategyFactory).initStrategyMap();

        SignalStrategy actualStrategy = spySignalStrategyFactory.getStrategy(signal);
        assertNotNull(actualStrategy);
        assertSame(mockSignalStrategy, actualStrategy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStrategy_invalidSignal() throws Exception {
        spySignalStrategyFactory.getStrategy(999);
    }
}
