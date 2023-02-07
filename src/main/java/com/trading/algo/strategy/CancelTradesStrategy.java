package com.trading.algo.strategy;

import com.trading.algo.Algo;

public class CancelTradesStrategy implements SignalStrategy{
    @Override
    public void executeSignal(Algo algo) {
        algo.cancelTrades();
    }
}
