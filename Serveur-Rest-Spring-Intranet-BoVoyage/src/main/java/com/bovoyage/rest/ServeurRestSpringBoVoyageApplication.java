package com.bovoyage.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
@EnableAsync
public class ServeurRestSpringBoVoyageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurRestSpringBoVoyageApplication.class, args);
	}
		
		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.bovoyage.rest.service"))
					.build()
					.apiInfo(apiInfo());
		}

		
		private ApiInfo apiInfo() {
			
			return new ApiInfoBuilder() 
					.title("API Rest BoVoyage")
					.contact(new Contact("info","http://etcetera","dfjljflsjf"))
					.version("1.0.0")
					.build();

	}
}