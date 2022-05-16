package com.almeda.springbootdocker01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDocker01Application {

	@GetMapping("/welcome")
	public String welcome() {
		return "SpringBoot Docker Demo :)";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDocker01Application.class, args);
	}

}
