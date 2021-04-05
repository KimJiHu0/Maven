package com.maven.project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/loginpage.do")
	public String LoginPage(Model model) {
		model.addAttribute("msg", "test");
		return "/login/LoginPage";
	}

	@RequestMapping("/signin.do")
	public String SignInPage(Model model) {
		return "SignInPage";
	}
	
	@RequestMapping(value = "/signinres.do", method = RequestMethod.POST)
	public String SignInRes(String id, String pw) {
		System.out.println(System.getProperty("file.encoding"));
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		return "";
	}
}
