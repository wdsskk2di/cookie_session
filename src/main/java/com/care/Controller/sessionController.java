package com.care.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sessionController {

	/* 세션 추가 방법1
	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", "하나");
		session.setAttribute("age", "20");
		session.setAttribute("addr", "마포");
		
		return "session/makeSession";
	}
	*/
	
	//세션 추가 방법2
	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request, HttpSession session) {
		session.setAttribute("id", "하나");
		session.setAttribute("age", "20");
		session.setAttribute("addr", "마포");
		
		return "session/makeSession";
	}
	
	@RequestMapping("resultSession")
	public String resultSession() {
		return "session/resultSession";
	}
	
	@RequestMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		//session.invalidate();
		
		return "session/delSession";
	}
}
