package com.spring_boot.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring_boot.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
	/*
	choose the right name;
	void delete(id) no, void deleteById(int id) is ok
	*/
	public Product findById(int id);
	public List<Product> findByPriceGreaterThan(int price);
	public Product post(Product product);
	public List<Product> findAll();
	public void deleteById(int id);
	
}
