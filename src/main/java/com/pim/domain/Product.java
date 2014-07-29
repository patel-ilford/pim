package com.pim.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	    @Id
	    private String id;

	    private String code;
	    private Double price;

	    public Product() {}

	    public Product(String code, Double price) {
	        this.code = code;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "Product[id=%s, code='%s', price='%s']",
	                id, code, price);
	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

	}