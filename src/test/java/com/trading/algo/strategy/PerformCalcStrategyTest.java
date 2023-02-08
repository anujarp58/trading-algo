package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
public class PerformCalcStrategyTest {
    @Mock
    private Algo algo;
    @InjectMocks
    private PerformCalcStrategy performCalcStrategy;
    @Test
    public void testExecuteSignal() {
        performCalcStrategy.executeSignal(algo);
        verify(algo).setAlgoParam(1, 90);
        verify(algo).setAlgoParam(2, 15);
        verify(algo).performCalc();
        verify(algo).submitToMarket();
    }
}
