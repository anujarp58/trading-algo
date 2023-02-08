/**
 *
 *This class creates object of strategy and executes signal.
 *
 */
package com.trading.algo.service;

import com.trading.algo.lib.Algo;
import com.trading.algo.lib.SignalHandler;
import com.trading.algo.strategy.SignalStrategy;
import org.springframework.stereotype.Service;


@Service
public class Application  implements SignalHandler {
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        SignalStrategy strategy = SignalStrategyFactory.getStrategy(signal);
        strategy.executeSignal(algo);
        algo.doAlgo();
    }
}

