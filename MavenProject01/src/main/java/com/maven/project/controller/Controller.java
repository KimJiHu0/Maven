package com.maven.project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/hello")
	public String Hello(Model model) {
		model.addAttribute("msg", "Hello, Maven Project");
		model.addAttribute("test","Test model");
		model.addAttribute("ko_msg","안녕하세요.");
		return "hello";
	}
	
}
