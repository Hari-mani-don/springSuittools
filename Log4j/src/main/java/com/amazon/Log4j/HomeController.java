package com.amazon.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	Logger logger = LogManager.getLogger(HomeController.class);

	@GetMapping("/home")
	public void home() {
		logger.info("HariMnai");
	}
}
