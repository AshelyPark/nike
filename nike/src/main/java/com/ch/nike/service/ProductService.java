package com.ch.nike.service;

import java.util.List;

import com.ch.nike.dto.Category;
import com.ch.nike.dto.Member;
import com.ch.nike.dto.PagingBean;
import com.ch.nike.dto.Product;

public interface ProductService {

	List<Product> list();

	List<Product> productlist(Category category);

	Product count(Category category);

	List<Product> color(Category category);

	Product colorcount(Category category);
	List<Product> adminproductlist();
	
	Product selectCartDetail(String email, int productDetailNo, String color);

	List<Product> selectProduct();

	Product selectProductOne(int productNo);

	Product productInfo(int productNo, String color);


	List<Product> paginglist(PagingBean pagingbean);

	int productinsert(Product product);

	int selectproductNo();

	int getTotal();

	Product select(int productDetailNo);

	int productupdate(Product product);
}
