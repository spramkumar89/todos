package com.ram.todos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodosController {
	
	@GetMapping("/todos")
	public String hello() {
		return "Hello World! This is my first rest service in spring boot and fourth";
	}
}
