package com.ani.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.boot.service.CarService;

// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
@SpringBootApplication // = @Configuration + @ComponentScan + @EnableAutoConfiguration
public class SpringBootUnderstandingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootUnderstandingApplication.class, args);

		CarService service =  ctx.getBean(CarService.class);
		service.createNewCar(10L, "Suzuki", "Open-Top");
	}
}

