package com.ch.nike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.nike.dto.Member;
import com.ch.nike.dto.PagingBean;


@Mapper
public interface MemberMapper {

	Member select(String email);
	int insert(Member member);
	List<Member> memberlist();
	int update(Member member); //새비번변경
	int deleteMember(String email);
	int getTotal();
	List<Member> paginglist(PagingBean pagingbean);

}
