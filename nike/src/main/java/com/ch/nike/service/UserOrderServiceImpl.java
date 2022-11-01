package com.ch.nike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.nike.dto.UserOrder;
import com.ch.nike.mapper.UserOrderMapper;

@Service
public class UserOrderServiceImpl implements UserOrderService{
	@Autowired
	private UserOrderMapper uod;

	@Override
	public List<UserOrder> orderlist() {
		return uod.orderlist();
	}
	@Override
	public List<UserOrder> userorderselect(String email) {
		return uod.userorderselect(email);
	}
}