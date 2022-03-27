package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapProducerApplication {

	//https://www.concretepage.com/spring-boot/spring-boot-soap-web-service-example
	//http://localhost:8082/soapws/articles.wsdl
	//http://localhost:8082/h2-console
	public static void main(String[] args) {
		SpringApplication.run(SoapProducerApplication.class, args);
	}

	/*CREATE DATABASE IF NOT EXISTS `concretepage`;
	USE `concretepage`;

	CREATE TABLE IF NOT EXISTS `articles` (
			`article_id` bigint(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
	PRIMARY KEY (`article_id`)
) ENGINE=InnoDB;

	INSERT INTO `articles` (`article_id`, `title`, `category`) VALUES
			(1, 'Java Concurrency', 'Java'),
	(2, 'Spring Boot Getting Started', 'Spring Boot');*/

}
