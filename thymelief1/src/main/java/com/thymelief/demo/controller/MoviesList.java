package com.thymelief.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesList {
//	@Value("${spring.datasource.url}")
//	private String db;
	
	@GetMapping("/movies")
	public String getMoviesList() {
		return "Html/moviesList";
	}
}

