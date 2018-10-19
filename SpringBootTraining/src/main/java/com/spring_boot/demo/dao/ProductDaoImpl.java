/*
package com.spring_boot.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring_boot.demo.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	 public static List<Product> products=new ArrayList<>();
	    static {
	        products.add(new Product(1, new String("pc"), 350,200));
	        products.add(new Product(2, new String("iphone"), 500,450)); 
	        products.add(new Product(3, new String("pingPang"), 750,300));
	    }
	    
	@Override
	public List<Product> getAllProducts() {
		return products;
	}

	@Override
	public Product getProductById(int id) {
		for(Product product:products) {
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product saveProduct(Product product) {
		products.add(product);
		return product;
	}

}
*/