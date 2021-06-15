package com.house.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String helloworld(Map<String,Object> map) {
		
		return "helloworld.html";
	}
}
