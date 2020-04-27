package com.care.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sessionController {

	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
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
