package com.prabhakar.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("")
	public String hello() {
		return "Hello method";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "World method";
	}
}
