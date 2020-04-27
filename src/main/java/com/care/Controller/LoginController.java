package com.care.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	//login 페이지
	@GetMapping("login")
	public String loginGet(HttpSession session, @CookieValue(value = "myCookie", required = false) Cookie cook, Model model) {
		
		if(cook != null) {	//popup에서 쿠키 생성했을 시
			model.addAttribute("popUpCookie", cook.getValue());	//attribute 추가(팝업 유무 체크 위해)
		}
		
		//Quiz! 방법1. AleadyLogin 페이지를 만들어 쓴다
//		if(session.getAttribute("loginUser") != null) {	//로그인 상태면 AlreadyLogin 페이지로 이동
//			return "login/AlreadyLogin";
//		}else {	//로그인 되지 않았다면 login 페이지로 이동
//			return "login/login";
//		}
		
		//Quiz! 방법2. login.jsp에서 jstl을 이용해 로그인 상태에 따른 페이지 출력을 구분한다
		return "login/login";
	}
	
	//입력된 아이디와 비번 체크
	@PostMapping("chkUser")
	public String chkUser(HttpServletRequest request) {
		//아이디, 비번, 닉네임
		String id = "1", pwd="1", nickName="하나";
		
		//입력 받아온 이름, 비번
		String reqId = request.getParameter("id");
		String reqPwd = request.getParameter("pwd");
		
		//세션
		HttpSession session = null;
		
		if(id.equals(reqId) && pwd.equals(reqPwd)) {
			//아이디, 비번 같으면 세션 만들고 main 페이지로.
			session = request.getSession();
			session.setAttribute("loginUser", nickName);
			
			return "login/main";
		}else {return "redirect:login";}//아이디, 비번 다르면 login 페이지.
	}
	
	//logout 페이지
	@RequestMapping("logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();	//세션 제거
		return "login/logout";
	}
	
	
	//main 페이지
	@RequestMapping("main")
	public String main() {
		return "login/main";
	}
	
	
	//Controller의 login에서 사용하지만, 웹페이지에서 AlreadyLogin을 직접 연결하지 않아 필요 없음
	//로그인 상태에서 login 페이지 접근 시 AlreadyLogin
//	@RequestMapping("AlreadyLogin")
//	public String AlreadyLogin() {
//		return "login/AlreadyLogin";
//	}
	
}
