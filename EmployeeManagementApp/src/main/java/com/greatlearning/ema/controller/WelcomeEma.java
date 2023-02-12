package com.greatlearning.ema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeEma {
	
	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

}
