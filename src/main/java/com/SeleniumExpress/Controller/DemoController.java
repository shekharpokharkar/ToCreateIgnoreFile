package com.SeleniumExpress.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/Hello")
	public String sayHello()
	{
		return"Hello";
	}
	
	@GetMapping("/Hi")
	public String sayHI()
	{
		return"Hello Good Morning";
	}

}
