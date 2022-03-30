package com.web.demo;

import com.web.demo.models.Article;
import com.web.demo.repos.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SoapProducerApplication implements CommandLineRunner {

	//https://www.concretepage.com/spring-boot/spring-boot-soap-web-service-example
	//http://localhost:8082/soapws/articles.wsdl
	//http://localhost:8082/h2-console
	//select * from articles;
	public static void main(String[] args) {
		SpringApplication.run(SoapProducerApplication.class, args);
	}

	@Autowired
	IArticleRepository iArticleRepository;
	@Override
	public void run(String... args) throws Exception {
		List<Article> articleList = Arrays.asList(
				new Article("Processing","Java"),
				new Article("Processing and Saving","Oracle"),
				new Article("Presentation","Angular"),
				new Article("Deployment","DevOps")
		);
		iArticleRepository.saveAll(articleList);
	}

	/*
	CREATE TABLE IF NOT EXISTS articles (
			article_id bigint(5) NOT NULL AUTO_INCREMENT,
  			title varchar(200) NOT NULL,
  			category varchar(100) NOT NULL,
			PRIMARY KEY (article_id))
*/

}
