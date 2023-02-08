package com.trading.algo.strategy;

import com.trading.algo.lib.Algo;

public interface SignalStrategy {
    void executeSignal(Algo algo);
}
