package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public Sting getDetails() {
		return "AWS CI CD is working...:)";
	}
}
