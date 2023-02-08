package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;

public class CancelTradesStrategy implements SignalStrategy{
    @Override
    public void executeSignal(Algo algo) {
        algo.cancelTrades();
    }
}
