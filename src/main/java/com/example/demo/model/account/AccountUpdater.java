package com.example.demo.model.account;

import com.demo.dbflute.allcommon.CDef.AccountStatus;
import com.demo.dbflute.exbhv.AccountBhv;
import com.demo.dbflute.exentity.Account;
import com.example.demo.model.AbstractModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kosuke
 */
@Repository
@Transactional
public class AccountUpdater extends AbstractModel {

	@Autowired
	private AccountBhv accountBhv;

	@Autowired
	private AccountSearcher accountSearcher;

	/**
	 * アカウント登録処理
	 */
	public void registerAccount(AccountRegisterForm form) {
		assertNotNull(form);

		Account account = new Account();
		account.setAccountName(truncateEmailDomain(form.getEmail()));
		account.setAccountDisplayId(form.getAccountDisplayId());
		account.setEmailAddress(form.getEmail());
		account.setPassword(form.getPassword());
		account.setAccoutStatusCd(AccountStatus.Register.code());
		accountBhv.insert(account);
	}

	/**
	 * 本登録処理としてステータスをACTに更新
	 */
	public void activateCandidate(Long accountId) {
		assertNotNull(accountId);

		Account account = accountSearcher.findAccountById(accountId);
		if (account == null || !account.getAccoutStatusCd().equals(AccountStatus.Register)) {
			return;
		}
		account.setAccoutStatusCd(AccountStatus.Active.code());
		accountBhv.update(account);
	}

	/**
	 * メールアドレスの@以下を省いたアドレスを取得
	 */
	private String truncateEmailDomain(String email) {
		return email.split("@")[0];
	}
}
