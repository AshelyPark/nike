package com.ch.nike.service;

import java.util.List;

import com.ch.nike.dto.Address;

public interface AddressService {
	
	// AccountCon
	// 회원의 모든 배송지 조회
	List<Address> selectAddr(String email);

}
