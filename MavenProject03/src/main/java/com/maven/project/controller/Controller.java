package com.maven.project.controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@org.springframework.stereotype.Controller
public class Controller {
	
	// 언어 변경
	@RequestMapping(value = "/changelang.do")
	public String ChangeLanguage(String lang, HttpSession session, HttpServletRequest request) {
		
		// locale을 선언하면서 동시에 변경할 언어를 파라미터로 넣어서 변경한다.
		Locale locale = new Locale(lang);
		
		// 세션에 저장되어있는 언어를 받아온 언어 lang으로 변경한다는 의미.
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
		
		// getHeader("referer")을 출력해보면 이전에 내가 있던 url이 전부 나돈다
		// ex) http://localhost:8787/MavenProject/ 혹은 @@@.do 까지 나오게 된다.
		String[] redirects = request.getHeader("referer").split("/");
		// 그래서 가장 마지막에 존재하는 @@.do를 출력하기 위해서 아래와 같이 작성했다.
		String redirect = redirects[redirects.length-1];
		
		// 하지만 가장 처음 페이지인 LoginPage.jsp에서 실행하게 된다면 redirect는 MavenProject이다.
		// 그래서 만일 MavenProject라면
		// main.do라는 요청을 받아 LoginPage.jsp를 return하는 Method를 만들었고,
		// 만일 MavenProject가 아니라면 해당 @@.do로 redirect해준다.
		if(redirect.equals("MavenProject")) {
			return "redirect:/main.do";
		} else {
			return "redirect:/"+redirect;
		}
	}
	
	@RequestMapping(value = "main.do")
	public String MainPage() {
		return "/login/LoginPage";
	}
	
	@RequestMapping("/loginpage.do")
	public String LoginPage(Model model) {
		return "/login/LoginPage";
	}

	
}
