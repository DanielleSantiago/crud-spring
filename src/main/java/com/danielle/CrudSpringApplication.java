package com.danielle;

import com.danielle.model.Course;
import com.danielle.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean //Uso quando quero que o spring gerencie todo o ciclo de vida da aplicação.
	CommandLineRunner initDataBase(CourseRepository courseRepository) { //Vai ser executado assim que a aplicação subir.

		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("Front-End");

			courseRepository.save(c);
		};
	} 

}
