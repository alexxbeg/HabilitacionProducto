package com.core.habilitacionproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HabilitacionProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HabilitacionProductoApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HabilitacionProductoApplication.class);
	}

}
