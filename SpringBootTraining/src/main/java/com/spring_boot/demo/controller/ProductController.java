package com.spring_boot.demo.controller;
import com.spring_boot.demo.dao.ProductDao;
import com.spring_boot.demo.exceptions.ProductNotFoundException;
import com.spring_boot.demo.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import org.springframework.http.ResponseEntity;


@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping(value = "/Products/{id}")
	public Product showProductById(@PathVariable int id) throws ProductNotFoundException {
		Product product = productDao.findById(id);
		if(product == null) throw new ProductNotFoundException("Product with id:"+id+" not found.");
		return product;
	}
	
	@GetMapping(value="test/Products/{price}")
	public List<Product> testPriceScope(@PathVariable int price){
		return productDao.findByPriceGreaterThan(price);
	}
	
	@PostMapping(value="/Products")
	public ResponseEntity<Void> saveProduct(@RequestBody Product product) {
		Product product1 = productDao.save(product);
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
	
	@RequestMapping(value="/Products",method = RequestMethod.GET)
	public List<Product> listProducts() {
		return productDao.findAll();
	}
	
	@DeleteMapping(value="/Products/{id}")
	public void deleteProductById(@PathVariable int id) {
		productDao.deleteById(id);
	}
	/*
	@PutMapping(value="/Products")
	public void putProduct(@RequestBody Product product) {
		productDao.save(product);
	}
	*/

}
