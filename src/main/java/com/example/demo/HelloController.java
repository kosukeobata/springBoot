package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kosuke
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "おはよう、世界。");
		return "hello";
	}
}
