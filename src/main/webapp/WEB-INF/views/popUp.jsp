<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function checkClik() {
		location.href="cookiChk";		
	}
	
	function cookieChk() {
		if("${makeCookie}"=="쿠키체크"){
			window.close();
		}
	}
</script>

</head>
<body onload="cookieChk()">
쿠키를 위한 팝업창<br>
<input type="checkbox" onclick="checkClik()">하루동안 열지 않음

</body>
</html>