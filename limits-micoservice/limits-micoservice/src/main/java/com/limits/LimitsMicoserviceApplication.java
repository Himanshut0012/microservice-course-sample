package com.limits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "com.limits","com.limits.controller"}) 
public class LimitsMicoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsMicoserviceApplication.class, args);
	}

}
