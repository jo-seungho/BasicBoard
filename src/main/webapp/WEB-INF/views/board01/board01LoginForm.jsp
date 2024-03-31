<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="../common/common.jsp" />
<link rel="stylesheet" href="/resources/css/board01/board01LoginForm.css">
<script src="/resources/js/board01LoginForm.js"></script>
<title>로그인</title>
</head>
<body>
    <div id = "container_wrap">
        <div class="container">
            <header>
                <img class="brand_logo" src="resources/img/jostagram_logo.png" alt="logo">
            </header>
            <form name="login" action="" method="post"> <!--method="post" : 정보를 숨겨서 보낸다-->
                <input class = "id" type="text" placeholder="전화번호,사용자 이름 또는 이메일"> <!--placeholder : 입력창 안에 text를 넣을 수 있다-->
                <input class = "pwd" type="password" placeholder="비밀번호">
                <button class = "loginBtn"><a href="#">로그인</a></button>
            </form>
            <div class="or_line">
                <div class="line"></div>
                <div class="text">또는</div>
                <div class="line"></div>
            </div>
            <ul class="findpw">
                <li><a href="findpwd.html">비밀번호를 잊으셨나요?</a></li>
            </ul>
        </div>
        <div class = "account">
            <ul>
                <li>계정이 없으신가요?</li>
                <li><a href="join.html">가입하기</a></li>
            </ul>
        </div>
    </div>
</body>
</html>