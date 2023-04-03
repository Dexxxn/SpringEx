
package org.hj.controller;

import javax.servlet.http.HttpSession;

import org.hj.model.LoginVO;
import org.hj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

	@Autowired
	LoginService ls;

	// 회원가입
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member() {
		return "member/memberin";
	}

	// 회원가입서버
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String memberPost(LoginVO member) {
		System.out.println(member);
		ls.memreg(member);
		return "board/list";
	}

	// 로그인 페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("aaaa");
		return "member/login";
	}

	// 로그인 서버
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(HttpSession session, LoginVO member) {

		/*
		 * System.out.println("contorller="+member);
		 * System.out.println(ls.login(member));
		 */

		if (ls.login(member) == null) {
			return "member/login";
		} else {
			session.setAttribute("login", ls.login(member));
			return "redirect:/list";
		}

	}

	// 회원관리페이지(관리자용)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String memberlist(Model model) {
		model.addAttribute("memlist", ls.memlist());
		return "member/list";
	}

	// 회원상세내용페이지(관리자용)
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	// public String memberView(String id, Model model) {
	public String memberView(LoginVO login, Model model) {
		// model.addAttribute("memview", ls.memview(id));
		model.addAttribute("view", ls.memview(login));
		return "member/view";
	}

	// 회원정보 수정 (관리자용)
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String memberModify(LoginVO login, RedirectAttributes rttr) {
		ls.memberModify(login);
		rttr.addAttribute("id", login.getId());
		return "redirect:/view"; // 수정후 화면
	}

	// 회원정보 삭제(관리자용)
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String memberRemove(LoginVO login) {
		ls.memberRemove(login);
		return "redirect:/list";
	}
}
