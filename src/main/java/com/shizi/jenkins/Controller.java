package com.shizi.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShiZi
 */
@RestController
public class Controller {
    @GetMapping("/")
    public String isRunning() {
        return "OK";
    }
}
