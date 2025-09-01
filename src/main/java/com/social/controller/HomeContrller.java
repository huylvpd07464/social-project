package com.social.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContrller {

	@GetMapping
	public String homeControllerHandler() {
		return "this is controller";
	}
	
	@GetMapping("/home")
	public String homeControllerHandler2() {
		return "this is controller 2";
	}
	
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
}
