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
    String sum (@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(calculatorApplication.sum(a,b));
    }

    @RequestMapping("/mul")
    String mul (@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(calculatorApplication.mul(a,b));
    }
}
