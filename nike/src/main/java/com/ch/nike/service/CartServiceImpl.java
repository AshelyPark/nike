package com.ch.nike.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.nike.dto.Cart;
import com.ch.nike.mapper.CartMapper;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper cm;
	
	// AccountCon
	public List<Cart> cartList(String email) {
		return cm.cartList(email);
	}
	@Override
	public Cart select(Cart cart) {
		return cm.select(cart);
	}
	@Override
	public int insert(Cart cart) {
		return cm.insert(cart);
	}
	@Override
	public int update(Cart cart2) {
		return cm.update(cart2);
	}
	public int deleteCart(int cartNo) {
		return cm.deleteCart(cartNo);
	}
	public Cart selectBy(int cartNo) {
		return cm.selectBy(cartNo);
	}
	public void updateQuantity(Cart cart) {
		cm.updateQuantity(cart);
	}
	public void updateSize(Cart cart) {
		cm.updateSize(cart);
	}
	
	// UserOrderCon
	public int totalPriceByEmail(String email) {
		return cm.totalPriceByEmail(email);
	}
	public void deleteAfterOrder(String email) {
		cm.deleteAfterOrder(email);
	}
	
}
