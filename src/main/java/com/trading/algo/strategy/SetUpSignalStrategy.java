package com.trading.algo.strategy;


import com.trading.algo.lib.Algo;

public class SetUpSignalStrategy implements SignalStrategy {
    @Override
    public void executeSignal(Algo algo) {
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
