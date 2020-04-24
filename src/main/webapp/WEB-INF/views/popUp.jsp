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
		window.close();
	}
</script>

</head>
<body>
쿠키를 위한 팝업창<br>
<input type="checkbox" onclick="checkClik()">하루동안 열지 않음

</body>
</html>