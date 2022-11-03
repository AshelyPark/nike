package com.ch.nike.service;

import java.util.List;

import com.ch.nike.dto.Category;
import com.ch.nike.dto.Product;

public interface ProductService {

	List<Product> list();

	List<Product> productlist(Category category);

	Product count(Category category);

	List<Product> color(Category category);

	Product colorcount(Category category);
	List<Product> adminproductlist();
	
	Product selectCartThum(int productDetailNo);
	

}
