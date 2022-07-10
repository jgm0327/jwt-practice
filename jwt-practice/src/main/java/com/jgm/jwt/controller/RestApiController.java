package com.jgm.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	
	@GetMapping("/home")
	public @ResponseBody String home() {
		return "home";
	}
	
	@PostMapping("token")
	public String token() {
		return "<h1>token</h1>";
	}
}
