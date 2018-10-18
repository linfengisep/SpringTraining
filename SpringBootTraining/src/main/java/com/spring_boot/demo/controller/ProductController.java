package com.spring_boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@RequestMapping(value="/Products",method = RequestMethod.GET)
	public String listProducts() {
		return "macPro";
	}
}
