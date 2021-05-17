package com.salesmanager.shop.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.salesmanager.core.business.repositories.catalog.product.ProductMongoRepository;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableMongoRepositories(basePackageClasses = ProductMongoRepository.class)
public class ShopApplication extends SpringBootServletInitializer {
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShopApplication.class);
    }
	
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
