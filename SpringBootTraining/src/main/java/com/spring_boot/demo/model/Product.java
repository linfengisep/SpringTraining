package com.spring_boot.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties(value= {"id","buyingPrice"})
@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id;
	@Length(min=3,max=20,message ="length is not good")
	private String name;
	private int price;
	private int buyingPrice;
	public Product() {}
	public Product(int id, String name, int price, int buyingPrice) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.buyingPrice = buyingPrice;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", buyingPrice=" + buyingPrice + "]";
	}
	
	
}
