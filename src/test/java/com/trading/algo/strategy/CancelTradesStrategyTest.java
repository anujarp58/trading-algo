package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CancelTradesStrategyTest {
    @Mock
    private Algo algo;
    @InjectMocks
    private CancelTradesStrategy cancelTradesStrategy;
    @Test
    public void testExecuteSignal() {
        cancelTradesStrategy.executeSignal(algo);
        verify(algo).cancelTrades();
    }
}
