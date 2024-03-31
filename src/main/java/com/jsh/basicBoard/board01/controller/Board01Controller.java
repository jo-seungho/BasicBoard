package com.jsh.basicBoard.board01.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsh.basicBoard.board01.model.service.Board01Service;

@Controller
public class Board01Controller {
	
	/*
	 * @Autowired private Board01Service board01Service;
	 */
	
	/**
	 * board01 메인 화면으로 이동
	 * @return
	 */
	@RequestMapping("board01Main")
	public String board01Main() {
		
		return "/board01/board01LoginForm";
		
	}

}
