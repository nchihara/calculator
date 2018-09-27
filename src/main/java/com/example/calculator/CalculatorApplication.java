package com.example.calculator;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import	org.springframework.stereotype.Service;

//@SpringBootApplication
@Service
public class CalculatorApplication {

	long sum(long a, long b){
		return (a+b);
	}

}
