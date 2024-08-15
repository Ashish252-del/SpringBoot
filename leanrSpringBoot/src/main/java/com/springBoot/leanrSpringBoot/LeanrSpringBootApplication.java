package com.springBoot.leanrSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeanrSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(LeanrSpringBootApplication.class, args);
		System.out.println("running buddy !55!");

	}
}

// note --> so what we did we generate a project from spring io start and there we add web dependency
// by searching web , web dependency is used to create web api it will give you tomcat dependency  in pom file by default

// now let's talk about spring boot magic so springboot does auto configuration for you let say it does
// basically on the basis of pom.xml file all the jar files downloaded in intelijee idea you can see in External Libraries
// In Spring Boot, auto-configuration is indeed based on the presence of certain jar files in the classpath
// auto configuration means like spring boot will do component scan for you , it will create beans for you by default it
// will scan current package for component scan

// Spring boot actuator ------>
//it basically monitor our application in production gives us different end point to know the performance of application
// so basically to add actuator in your project you need to add dependency in pom.xml file
// also to access all end points actuator you need to search localhost:8080/actuator
// Now if you want to get all list you can mention that in application.properties file in resources folder
// management.endpoints.web.exposure.include =* to expose all the end point
// management.endpoints.web.exposure.include = health,matrix // to enable specific one and it is recommended
// in matrix you can see how many request are made by clients