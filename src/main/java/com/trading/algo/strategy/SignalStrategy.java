package com.trading.algo.strategy;

import com.trading.algo.Algo;

public interface SignalStrategy {
    void executeSignal(Algo algo);
}
