package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Member;
import com.ch.nike.dto.PagingBean;


@Mapper
public interface MemberMapper {

	// MemberCon
	Member select(String email);
	int insert(Member member);
	int update(Member member); //새비번변경
	
	
	
	// AccountCon
	int deleteMember(String email);
	
	
	
	// AdminCon
	List<Member> paginglist(PagingBean pagingbean);
	int getTotal(PagingBean pagingbean);

}
