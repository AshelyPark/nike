package com.ch.nike.mapper;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Category;
import com.ch.nike.dto.Product;

@Mapper
public interface ProductMapper {

	List<Product> list();

	List<Product> productlist(Category category);

	Product count(Category category);

	List<Product> color(Category category);

	Product colorcount(Category category);

	List<Product> adminproductlist();

	Product selectCartDetail(HashMap<String, Object> map);

	List<Product> selectProduct();

	Product selectProductOne(int productNo);

	Product productInfo(HashMap<String, Object> map);



}
