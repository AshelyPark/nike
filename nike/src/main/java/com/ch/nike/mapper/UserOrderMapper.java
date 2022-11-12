package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.PagingBean;
import com.ch.nike.dto.Product;
import com.ch.nike.dto.UserOrder;


@Mapper
public interface UserOrderMapper {

	// AccountCon
	List<UserOrder> selectUserOrder(String email);
	List<UserOrder> selectOrderDetail(int orderNo);
	List<UserOrder> selectUserOrderDetail(int orderNo);
	List<UserOrder> orderInfoAll(int orderDetailNo);
	List<Integer> orderCnt(int orderNo);
	
	// AdminCon
	List<UserOrder> userorderselect(String email);
	int getTotal(PagingBean pagingbean);
	List<UserOrder> paginglist(PagingBean pagingbean);
	List<UserOrder> paginglistrefunchk(PagingBean pagingbean);
	List<UserOrder> paginglistrefundchk(PagingBean pagingbean);
	
	
	


}
