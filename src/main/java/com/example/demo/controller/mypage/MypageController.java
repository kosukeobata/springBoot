package com.example.demo.controller.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kosuke
 */
@Controller
@RequestMapping("mypage")
public class MypageController {

	@RequestMapping("")
	public String index() {
		return "mypage/index";
	}
}
