/**
 *
 *This class determines strategy based on signal and returns it.
 *
 */
package com.trading.algo.service;

import com.trading.algo.strategy.*;

import java.util.HashMap;
import java.util.Map;
public class SignalStrategyFactory {
    public static final Map<Integer, SignalStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(1, new SetUpSignalStrategy());
        strategyMap.put(2, new ReverseSignalStrategy());
        strategyMap.put(3, new PerformCalcStrategy());
        strategyMap.put(-1, new CancelTradesStrategy());
        // Add more strategies as needed
    }
    public static SignalStrategy getStrategy(int signal) {
        SignalStrategy strategy = strategyMap.get(signal);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid signal: " + signal);
        }
        return strategy;
    }
}
