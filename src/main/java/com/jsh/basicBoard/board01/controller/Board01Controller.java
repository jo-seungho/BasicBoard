package com.jsh.basicBoard.board01.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsh.basicBoard.board01.model.service.Board01Service;
import com.jsh.basicBoard.board01.model.service.Member01Service;
import com.jsh.basicBoard.board01.model.vo.Member01;

@Controller
public class Board01Controller {
	
	 @Autowired 
	 private Board01Service board01Service;
	 
	 @Autowired 
	 private Member01Service memberService;
	 
/* ------------------------ 멤버 관련 ---------------------------- */	 
	
	@RequestMapping("login")
	public ModelAndView login(Member01 m, HttpSession session, ModelAndView mv) {
		
		Member01 loginUser = memberService.loginMember(m);
		
		if(loginUser != null) { // 로그인 성공
			
			session.setAttribute("loginUser", loginUser);
			session.setAttribute("alertMsg", "로그인 성공 !");
			
			mv.setViewName("redirect:/");
			
		} else { // 로그인 실패
		
			mv.addObject("alertMsg", "로그인 실패");
			
			mv.setViewName("board01/board01LoginForm");
			
		}
		
		return mv;
	} 
	 
	 
	 
	 
/* ------------------------ 게시판 관련 ---------------------------- */	 
	 
	/**
	 * board01 메인 화면으로 이동
	 * @return
	 */
	@RequestMapping("board01Main")
	public String board01Main() {
		
		return "/board01/board01LoginForm";
		
	}

}
