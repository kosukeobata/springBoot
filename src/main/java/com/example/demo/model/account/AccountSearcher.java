package com.example.demo.model.account;

import com.demo.dbflute.exbhv.AccountBhv;
import com.demo.dbflute.exentity.Account;
import com.example.demo.model.AbstractModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

/**
 * @author kosuke
 */
@Repository
@ComponentScan("com.demo.dbflute")
public class AccountSearcher extends AbstractModel {

	@Autowired
	private AccountBhv accountBhv;

	public Account findAccountById(Long accountId) {
		assertNotNull(accountId);
		return accountBhv.selectByPK(accountId).orElse(null);
	}
}
