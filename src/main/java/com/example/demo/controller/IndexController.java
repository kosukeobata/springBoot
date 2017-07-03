package com.example.demo.controller;

import com.demo.dbflute.allcommon.CDef;
import com.demo.dbflute.exbhv.AccountBhv;
import com.demo.dbflute.exentity.Account;
import com.example.demo.model.account.AccountRegisterForm;
import com.example.demo.model.account.AccountUpdater;
import com.example.demo.model.common.TimeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kosuke
 */
@Controller
public class IndexController {

	@Autowired
	private AccountUpdater accountUpdater;
	@Autowired
	private AccountBhv accountBhv;
	@Autowired
	private TimeManager timeManager;

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
	@RequestMapping(value = "doRegister", method = RequestMethod.POST)
	public String doRegister(AccountRegisterForm form) {
		if (!form.validateRegisterInfo().isEmpty()) {
			// TODO valudate処理
			return "index";
		}
		Account account = new Account();
		account.setAccountName(truncateEmailDomain(form.getEmail()));
		account.setAccountDisplayId(form.getAccountDisplayId());
		account.setEmailAddress(form.getEmail());
		account.setPassword(form.getPassword());
		account.setAccoutStatusCd(CDef.AccountStatus.Register.code());
		accountBhv.insert(account);
		return "redirect:/mypage";
	}

	private String truncateEmailDomain(String email) {
		return email.split("@")[0];
	}

	/**
	 * 本登録処理完了画面
	 */
	@RequestMapping("active")
	public String active() {
		return "active/index";
	}

	/**
	 * 本登録処理
	 */
	@RequestMapping("doActive")
	public String doActive(AccountRegisterForm form) {
		if (form.validateAccountId() != null) {
			return "/";
		}
		accountUpdater.activateCandidate(form.getAccountId());
		return "/active";
	}

	@ModelAttribute
	AccountRegisterForm setupForm() {
		return new AccountRegisterForm();
	}
}
