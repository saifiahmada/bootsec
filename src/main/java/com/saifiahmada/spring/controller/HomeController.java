package com.saifiahmada.spring.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	public String home(Map<String, Object> model) {
		model.put("message", "Hello World");
		model.put("title", "Hello Home");
		model.put("date", new Date());
		return "home";
	}
	
	@RequestMapping("/form")
	@Secured({"ROLE_ADMIN"})
	public String form(Map<String, Object> model) {
		model.put("message", "Hello World");
		model.put("title", "Hello Home");
		model.put("date", new Date());
		return "form";
	}

}
