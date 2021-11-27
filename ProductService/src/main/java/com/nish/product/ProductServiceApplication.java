package com.nish.product;

import com.nish.product.command.api.exception.ProductServiceEventsErrorHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	public void configure(EventProcessingConfigurer eventProcessingConfigurer){
eventProcessingConfigurer.registerListenerInvocationErrorHandler("product", configuration -> new ProductServiceEventsErrorHandler());
	}

}
