package com.event.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.event.management.dao.EventDao;
import com.event.management.dao.impl.EventDaoImpl;

@SpringBootApplication
public class EmsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmsAppApplication.class, args);
	}
	
	/*@Bean
	public EventDao eventDaoBean() {
		return new EventDaoImpl();
	}*/
	
}

