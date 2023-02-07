package com.trading.algo.strategy;

import com.trading.algo.Algo;

public class ReverseSignalStrategy implements SignalStrategy{
    @Override
    public void executeSignal(Algo algo) {
        algo.reverse();
        algo.setAlgoParam(1, 80);
        algo.submitToMarket();
    }
}
