package com.trading.algo.controller;

import com.trading.algo.service.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * This class is a controller class to handle incoming request
 * with signal
 */
@RestController
@RequestMapping("/api")
public class TradingController {
    @Autowired
    Application app;
    @PostMapping(value = "v1/signal")
    public void handleSignal(@RequestBody int signal) {
        app.handleSignal(signal);
    }
}
