package com.care.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@GetMapping("login")
	public String loginGet() {
		return "login/login";
	}
	
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
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();	//세션 제거
		return "login/logout";
	}
}
