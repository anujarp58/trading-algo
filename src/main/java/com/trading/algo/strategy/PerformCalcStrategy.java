package com.trading.algo.strategy;

import com.trading.algo.Algo;

public class PerformCalcStrategy implements SignalStrategy{
    @Override
    public void executeSignal(Algo algo) {
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
