/**
 *
 * This class determines strategy based on signal and returns it.
 *
 */
package com.trading.algo.service;

import com.trading.algo.strategy.*;

import java.util.HashMap;
import java.util.Map;
public class SignalStrategyFactory {
    private static Map<Integer, SignalStrategy> strategyMap;

    //initialize the map lazily on the first call to get the strategy
    public static SignalStrategy getStrategy(int signal) {
        if (strategyMap == null || strategyMap.isEmpty()) {
            initMap();
        }
        SignalStrategy strategy = strategyMap.get(signal);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid signal: " + signal);
        }
        return strategy;
    }

    private static synchronized void initMap() {
        if (strategyMap == null) {
            strategyMap = new HashMap<>();
            strategyMap.put(1, new SetUpSignalStrategy());
            strategyMap.put(2, new ReverseSignalStrategy());
            strategyMap.put(3, new PerformCalcStrategy());
            strategyMap.put(-1, new CancelTradesStrategy());
            // Add more strategies as needed
        }
    }
}
