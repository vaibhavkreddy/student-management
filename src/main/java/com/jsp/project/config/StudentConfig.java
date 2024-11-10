package com.jsp.project.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp.project")

public class StudentConfig {
	@Bean(value = "emf")
	public EntityManager getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("student").createEntityManager();
	}
	
}
