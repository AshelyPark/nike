package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Address;

@Mapper
public interface AddressMapper {

	List<Address> selectAddr(String email);

}
