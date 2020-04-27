<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

	/*window.open()옵션
	width : 팝업창 가로길이,	height : 팝업창 세로길이
	toolbar=no : 단축도구창(툴바) 표시안함,	menubar=no : 메뉴창(메뉴바) 표시안함
	location=no : 주소창 표시안함, status=no : 아래 상태바창 표시안함
	scrollbars=no : 스크롤바 표시안함	
	resizable=no : 창변형 하지않음,	fullscreen=no : 전체화면 하지않음
	channelmode=yes : F11 키 기능이랑 같음
	left=0 : 왼쪽에 창을 고정(ex. left=30 이런식으로 조절),	top=0 : 위쪽에 창을 고정(ex. top=100 이런식으로 조절)
	*/

	function popup() {	//popup.jsp 연결.
		if("${popUpCookie}" == ""){	//팝업창에서 체크박스 누르지 않은 경우
			//팝업창(popUp.jsp)을 띄운다
			window.open("popUp","팝업창 이름","width=500, height=500, resizable=no");
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