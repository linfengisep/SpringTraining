package com.spring_boot.demo.dao;
import com.spring_boot.demo.model.Product;
import java.util.List;

public interface ProductDao {
	
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public Product saveProduct(Product product);
}
