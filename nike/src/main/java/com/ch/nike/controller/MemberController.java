package com.ch.nike.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.nike.dto.Member;
import com.ch.nike.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService ms;

	@RequestMapping("/member/emailLoginForm.do")
	public String emailLoginForm(String email, Model model) {
		model.addAttribute("email", email);
		return "member/emailLoginForm";
	}

	@RequestMapping("/member/emailLogin.do")
	public String emailLogin(Member member, Model model) {
		Member member2 = ms.select(member.getEmail());
		// 가입되어있을때
		if (member2 != null) { // 이미 있는 회원

			if (member2.getMemberDel().equals("Y")) { // 탈퇴한 회원
				int result = 1;
				model.addAttribute("result", result);
				return "member/emailLoginForm";
			} else { // 비번입력 후 로그인
				return "member/pwLoginForm";
			}
		} else // 가입안되어있을때
			return "member/joinForm";

	}

	@RequestMapping("/member/join.do")
	public String join(Member member, String tel1, String tel2, String tel3, Model model) {
		int result = 0;
		String memberTel = tel1 + "-" + tel2 + "-" + tel3;
		Member member2 = null;
		member.setMemberTel(memberTel);
		member2 = ms.select(member.getEmail());
		if (member2 == null) { // 가입안되어있을때
			result = ms.insert(member);
		} else // 가입되어있을때
			result = -1;
		model.addAttribute("result", result);
		model.addAttribute("member", member);
		return "member/join";
	}

	@RequestMapping("member/login.do")
	public String login(Member member, Model model, HttpSession session) {
		Member member2 = ms.select(member.getEmail());
		if (member2 != null) {
			if (member2.getPassword().equals(member.getPassword())) {
				session.setAttribute("email", member.getEmail());
				return "main";
			} else  {
				String msg = "📢비밀번호가 일치하지 않습니다";
				model.addAttribute("msg", msg);
				return "member/pwLoginForm";
			}
		} else
			return "member/emailLoginForm";
	}
}
