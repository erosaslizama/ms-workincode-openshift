package com.workincode.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	
	@GetMapping("/saludo")
	public String greeting() {
		return "openshift simple";
	}

	
	@GetMapping("/saludo2")
	public String greeting2() {
		return "openshift simple2";
	}

}
