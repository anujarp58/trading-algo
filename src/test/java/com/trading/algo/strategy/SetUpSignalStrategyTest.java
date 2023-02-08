package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SetUpSignalStrategyTest {
    @Mock
    private Algo algo;
    @InjectMocks
    private SetUpSignalStrategy setUpSignalStrategy;
    @Test
    public void testExecuteSignal() {
        setUpSignalStrategy.executeSignal(algo);
        verify(algo).setUp();
        verify(algo).setAlgoParam(1, 60);
        verify(algo).performCalc();
        verify(algo).submitToMarket();
    }
}
