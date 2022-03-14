package com.in28minutes.springboot.basics.springbootagain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootAgainApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringbootAgainApplication.class, args);
		for (String name: applicationContext.getBeanDefinitionNames())
			System.out.println(name);
	}

}
