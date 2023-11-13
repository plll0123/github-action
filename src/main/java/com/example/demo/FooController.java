package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

	@GetMapping("/foo")
	String foo() {
		return "foo";
	}

	@GetMapping("/var")
	String var(@Value("${name}") String name) {
		return name;
	}
}
