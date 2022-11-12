package com.ch.nike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.nike.dto.Member;
import com.ch.nike.dto.PagingBean;
import com.ch.nike.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper mm;

	// MemberCon
	public Member select(String email) {
		return mm.select(email);
	}
	public int insert(Member member) {
		return mm.insert(member);
	}
	public int update(Member member) {
		return mm.update(member);
	}
	
	
	
	// AccountCon
	public int deleteMember(String email) {
		return mm.deleteMember(email);
	}

	
	
	// AdminCon
	public List<Member> paginglist(PagingBean pagingbean) {
		return mm.paginglist(pagingbean);
	}
	public int getTotal(PagingBean pagingbean) {
		return mm.getTotal(pagingbean);
	}

	

}
