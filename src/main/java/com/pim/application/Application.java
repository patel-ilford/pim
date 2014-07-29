package com.pim.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.pim.config.SpringMongoConfig;
import com.pim.domain.Product;
import com.pim.repository.ProductRepository;

public class Application {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
	             new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations repository = (MongoOperations) ctx.getBean("mongoTemplate");
	
		
		repository.save(new Product("Vihanf", 10.00));
		repository.save(new Product("Shailesh", 9.99));

		Product response = new Product();
		List<Product> productlist = repository.findAll(Product.class);
		
		for(Product product:productlist)
		{
			System.out.println("Retrieved from Mongo DB and Code is ------>"+product.getCode());
		}
		
		System.out.println("Products found with findAll():");
		System.out.println("-------------------------------");
		

	}

}
