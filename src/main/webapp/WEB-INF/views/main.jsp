<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CSS 파일 연동 -->
<link rel="stylesheet" href="/resources/css/common/main.css">
<jsp:include page="./common/common.jsp" />

<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<title>메인페이지</title>
</head>
<body>
	<div id="mainContainer">
		<jsp:include page="./common/header.jsp" />	
			
			<div id=board-link>
				<a class="boardBtn" href="board01Main">Seungho's Board</a>
				<a class="boardBtn" href="">Board2</a>
				<a class="boardBtn" href="">Board3</a>
			</div>
			
		<jsp:include page="./common/footer.jsp" />	
	</div>
</body>
</html>