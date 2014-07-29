package com.pim.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pim.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    public Product findByCode(String code);
    public List<Product> findByPrice(Double Price);

}