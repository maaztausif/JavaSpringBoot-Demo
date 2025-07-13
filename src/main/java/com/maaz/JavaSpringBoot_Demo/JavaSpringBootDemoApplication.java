package com.maaz.JavaSpringBoot_Demo;

import com.maaz.JavaSpringBoot_Demo.model.Laptop;
import com.maaz.JavaSpringBoot_Demo.service.laptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaSpringBootDemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(JavaSpringBootDemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(JavaSpringBootDemoApplication.class);
//		Alien a1 = context.getBean(Alien.class);
//		a1.code();
//		System.out.println(a1);


		laptopService service = context.getBean(laptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
