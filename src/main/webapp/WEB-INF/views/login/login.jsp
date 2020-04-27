<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function popup() {	//popup.jsp 연결.
		if("${popUpCookie}" == ""){	//팝업창에서 체크박스 누르지 않은 경우
			window.open("popUp","","");	//팝업창을 띄운다
		}
	}
</script>

</head>
<body onload="popup()">

	<form action="chkUser" method="post">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="password" name="pwd" placeholder="비밀번호"><br>
		<input type="submit" value="로그인">
	</form>

</body>
</html>