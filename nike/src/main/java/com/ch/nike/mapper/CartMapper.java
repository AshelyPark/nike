package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Cart;
import com.ch.nike.dto.Product;

@Mapper
public interface CartMapper {
	
	Cart select(Cart cart);
	int insert(Cart cart);
	int update(Cart cart2);
	List<Cart> cartList(String email);
	int deleteCart(int cartNo);
		
}
