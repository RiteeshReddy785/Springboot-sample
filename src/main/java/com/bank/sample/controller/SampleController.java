package com.bank.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/api/jaga")
	String get()
	{
		return "New Api Found";
	}

}
