package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {

	@GetMapping("/products")
	public String product() {
		return "products";
	}
}
