package com.zura.eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PractiseController {

	@GetMapping("/sample")
	public String sample() {
		return "Fail!!!";
	}
}
