package com.ch.nike.service;


import java.util.List;

import com.ch.nike.dto.Product;
import com.ch.nike.dto.ProductDetail;

public interface ProductDetailService {

	// ProductCon
	// 특정 상품 특징 전체 조회
	List<ProductDetail> detailList(int productNo);
	//특정상품상세 - 사이즈만
	List<ProductDetail> productSizeList(Product product);
	
	
	
	// AdminCon
	// 상품 등록시 상세정보 등록
	int productinsert(Product product);
	// 
	int productupdate(Product product);


	// AccountCon
	int getProductDetailNo(ProductDetail productDetailr);



	List<ProductDetail> selectsize(ProductDetail productdetail);
	int getProductNoByDetailNo(int detailNo);
	List<ProductDetail> distinctSizeList(ProductDetail detail);

}
