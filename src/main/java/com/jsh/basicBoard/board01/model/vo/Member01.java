package com.jsh.basicBoard.board01.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member01 {
	
	private int userNo;			// USER_NO
	private String userId;		// USER_ID
	private String userPwd;		// USER_PWD
	private String userName;	// USER_NAME
	private String userNick;	// USER_NICKNAME
	private String phone;		// PHONE
	private String email;		// EMAIL
	private String address;		// ADDRESS
	private String status;		// STATUS
	private String enrollDate;	// ENROLL_DATE
}
