package com.example.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author kosuke
 */
@Aspect
@Component
public class TransactionalAround {

	@Autowired
	private AccessContextHelper accessContextHelper;

	/**
	 * Spring AOPによりコントローラーの(twitter.controller.*の)すべてのメソッドが呼び出される前後で呼び出される
	 *
	 * @param proceedingJoinPoint 共通処理が適用されるポイント
	 * @return コントローラーのメソッドの返り値
	 * @throws Throwable コントローラーで発生する例外
	 */
	@Around("within(com.example.demo.controller.*)")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		return accessContextHelper.invoke(proceedingJoinPoint.getSignature().getName(), proceedingJoinPoint::proceed);
	}

	@Bean
	AccessContextHelper getAccessContextHelper() {
		return new AccessContextHelper();
	}
}