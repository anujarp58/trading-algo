/**
 *
 * This class determines strategy based on signal and returns it.
 *
 */
package com.trading.algo.service;

import com.trading.algo.strategy.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SignalStrategyFactory {
    private static Map<Integer, SignalStrategy> strategyMap = new HashMap<>();

    //initialize the map lazily on the first call to get the strategy
    public static SignalStrategy getStrategy(int signal) {
        if (strategyMap.isEmpty()) {
            initStrategyMap();
        }
        SignalStrategy strategy = strategyMap.get(signal);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid signal: " + signal);
        }
        return strategy;
    }

    public static synchronized void initStrategyMap() {
            Properties prop = new Properties();
            try (InputStream input = SignalStrategyFactory.class.getClassLoader().getResourceAsStream("config.properties")) {
                prop.load(input);
                strategyMap = new HashMap<>();
                for (String key : prop.stringPropertyNames()) {
                    int signal = Integer.parseInt(key);
                    String className = prop.getProperty(key);
                    SignalStrategy strategy = (SignalStrategy) Class.forName(className).newInstance();
                    strategyMap.put(signal, strategy);
                }
            } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                throw new IllegalStateException("Failed to initialize signal strategy map", e);
            }
    }
}
