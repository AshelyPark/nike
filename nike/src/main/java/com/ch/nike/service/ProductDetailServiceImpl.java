package com.ch.nike.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.nike.dto.ProductDetail;

import com.ch.nike.mapper.ProductDetailMapper;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
	@Autowired
	private ProductDetailMapper pdm;

	@Override
	public List<ProductDetail> detailList(int productNo) {
		return pdm.detailList(productNo);
	}
}
