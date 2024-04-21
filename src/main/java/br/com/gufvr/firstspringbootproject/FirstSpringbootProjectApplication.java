package br.com.gufvr.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.gufvr")
public class FirstSpringbootProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectApplication.class, args);
	}
}