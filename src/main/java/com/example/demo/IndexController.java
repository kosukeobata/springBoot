package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kosuke
 */
@Controller
public class IndexController {

	/**
	 * メイン画面
	 * @return 登録処理・ログイン画面への遷移ができる
	 */
	@RequestMapping("/")
	public String index() {
		// TODO ログインしていればmypageに飛ばす
		return "index";
	}

	/**
	 * 登録処理
	 * @return 成功すればmypageに飛ばす
	 */
	@RequestMapping("doRegister")
	public String doRegister() {
		return "mypage/index";
	}
}
