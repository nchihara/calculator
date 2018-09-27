package com.example.calculator;

import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorApplicationController {
    @Autowired
    private CalculatorApplicationController calculatorApplication;

    @RequestMapping("/sum")
    String sum (@RequestParam("a") Long a, @RequestParam("b") Long b) {
        return String.valueOf(calculatorApplication.sum(a,b));
    }
}
