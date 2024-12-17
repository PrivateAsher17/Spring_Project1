package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class AddController {

	@RequestMapping("/add")
	public String add() {
		return "display.jsp";
	}
}
