package com.ch.nike.service;

import java.util.List;

import com.ch.nike.dto.ProductDetail;

public interface ProductDetailService {

	List<ProductDetail> color(int productNo);
	List<ProductDetail> size(int productNo);


	
}
