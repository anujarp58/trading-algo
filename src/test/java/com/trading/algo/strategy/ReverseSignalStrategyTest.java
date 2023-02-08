package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ReverseSignalStrategyTest {
    @Mock
    private Algo algo;
    @InjectMocks
    private ReverseSignalStrategy reverseSignalStrategy;
    @Test
    public void testExecuteSignal() {
        reverseSignalStrategy.executeSignal(algo);
        verify(algo).reverse();
        verify(algo).setAlgoParam(1, 80);
        verify(algo).submitToMarket();
    }
}
