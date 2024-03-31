package com.jsh.basicBoard.board01.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.jsh.basicBoard.board01.model.vo.Member01;

@Repository
public class Member01Dao {

	public Member01 loginMember(SqlSessionTemplate sqlSession, Member01 m) {
        // System.out.println("실행 전: " + m);
        Member01 result = sqlSession.selectOne("memberMapper.loginMember", m);
        // System.out.println("실행 후: " + result);
        return result;
	}

}
