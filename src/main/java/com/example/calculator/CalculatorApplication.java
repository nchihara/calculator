package com.example.calculator;

import	org.springframework.stereotype.Service;

@Service
public class CalculatorApplication {

	int sum(int a, int b){
		return a+b;
	}
	long mul(int a, int b) { return a*b }

}
