package com.example.demo.model.account;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kosuke
 */
@Data
public class AccountRegisterForm implements Serializable {

	private Long accountId;

	private String accountDisplayId;

	private String email;

	private String password;

	public List<String> validateRegisterInfo() {
		List<String> validateMessages = new ArrayList<>();

		if (accountDisplayId == null) {
			validateMessages.add("アカウントIDを入力してください");
		}

		if (email == null) {
			validateMessages.add("メールアドレスを入力してください");
		}

		if (password == null) {
			validateMessages.add("パスワードを入力してください");
		}

		return validateMessages;
	}

	public String validateAccountId() {
		if (accountId == null) {
			return "Idが指定されていません";
		}
		return null;
	}
}
