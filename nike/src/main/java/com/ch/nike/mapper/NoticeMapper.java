package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Notice;
import com.ch.nike.dto.PagingBean;
import com.ch.nike.dto.UserOrder;


@Mapper
public interface NoticeMapper {

	List<Notice> noticelist();

	List<UserOrder> paginglist(PagingBean pagingbean);

	int getTotal();


}
