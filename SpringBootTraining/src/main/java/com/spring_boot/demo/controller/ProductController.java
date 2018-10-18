package com.spring_boot.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring_boot.demo.dao.ProductDao;
import com.spring_boot.demo.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value="/Products",method = RequestMethod.GET)
	public List<Product> listProducts() {
		return productDao.getAllProducts();
	}
	
	@GetMapping(value="/Products/{id}")
	public Product showProduct(@PathVariable int id) {
		return productDao.getProductById(id);
	}
	
	@PostMapping(value="/Products")
	public ResponseEntity<Void> saveProduct(@RequestBody Product product) {
		Product product1 = productDao.saveProduct(product);;
		if(product == null) {
			return ResponseEntity.noContent().build();
		}
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(product1.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
