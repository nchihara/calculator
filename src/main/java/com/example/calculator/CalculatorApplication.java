package com.example.calculator;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import	org.springframework.stereotype.Service;

//@SpringBootApplication
@Service
public class CalculatorApplication {

	int sum(int a, int b){
		return a+b;
	}

}
