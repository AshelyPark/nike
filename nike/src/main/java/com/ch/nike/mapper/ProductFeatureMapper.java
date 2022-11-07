package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.ProductFeature;

@Mapper
public interface ProductFeatureMapper {
	List<ProductFeature> selectFeature(int productNo);
}
