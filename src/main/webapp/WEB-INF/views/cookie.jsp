<%@page import="org.springframework.web.servlet.tags.Param"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function popup() {
		if("${popUpCookie}" == ""){
			window.open("popUp","","");
		}
	}
</script>

</head>
<body onload="popup()">
cookie 페이지<hr>

</body>
</html>