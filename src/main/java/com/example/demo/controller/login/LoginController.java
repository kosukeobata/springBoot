package com.example.demo.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kosuke
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login/index";
	}

	@RequestMapping("/doLogin")
	public String doLogin() {
		return "myapge/index";
	}

}
