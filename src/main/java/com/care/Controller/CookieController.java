package com.care.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CookieController {
	/*
	@RequestMapping("cookie")							//2.추가. 쿠키 중 myCookie라는 이름이 있으면 그 값을 cook에 저장 
	public String myCookie(HttpServletResponse response, @CookieValue(value = "myCookie", required = false) Cookie cook) {
													//3.required = false 없으면 처음 실행시 쿠키값 없어서 오류. 있으면 -> 쿠키값 있으면 출력 , 없으면 그냥 넘긴다는 의미
		//2.
		System.out.println("cook: "+cook);	//3.처음에는 null. 그 다음부터는 값이 들어옴
		
		Cookie cookie = new Cookie("myCookie", "쿠키생성");	//쿠키생성
		cookie.setMaxAge(50);	//쿠키 존재 시간
		
		response.addCookie(cookie);	//쿠키 response에 추가
		
		return "cookie";
	}
	
	
	@RequestMapping("cookie")	
	public String myCookie(HttpServletResponse response,
			@CookieValue(value = "myCookie", required = false) Cookie cook,
			HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();	//쿠키값을 받아와서 배열에 저장
		if(cookies != null) {	//배열에 값이 들어가 있다면
			for(Cookie c : cookies)	System.out.println(c.getName()+": "+c.getValue());	//출력
		}
		
		System.out.println("cook: "+cook);
		
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(50);
		
		response.addCookie(cookie);
		
		return "cookie";
	}
	*/
	
	@RequestMapping("cookie")	
	public String myCookie(HttpServletResponse response,
			@CookieValue(value = "myCookie", required = false) Cookie cook, Model model) {
		
		if(cook != null) {
			model.addAttribute("popUpCookie", cook.getValue());
		}
	
		return "cookie";
	}
	
	@RequestMapping("popUp")	
	public String myCookie() {

		return "popUp";
	}
	
	@RequestMapping("cookiChk")	
	public String cookiChk(HttpServletResponse response, Model model) {

		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(50);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		model.addAttribute("makeCookie", "쿠키체크");
		
		return "popUp";
	}
	
}
