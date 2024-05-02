package com.example.comboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@RequestMapping("/test")
	public @ResponseBody String test() {
		return "test.....";
	}
}
