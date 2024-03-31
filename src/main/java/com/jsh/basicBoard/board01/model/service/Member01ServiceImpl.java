package com.jsh.basicBoard.board01.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsh.basicBoard.board01.model.dao.Member01Dao;
import com.jsh.basicBoard.board01.model.vo.Member01;

@Service
public class Member01ServiceImpl implements Member01Service {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private Member01Dao memberDao;
	
	@Override
	public Member01 loginMember(Member01 m) {
		
		Member01 loginUser = memberDao.loginMember(sqlSession, m);
		return loginUser;
	}

}
