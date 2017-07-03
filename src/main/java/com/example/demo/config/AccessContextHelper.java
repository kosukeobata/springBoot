package com.example.demo.config;

import org.dbflute.hook.AccessContext;

import java.time.LocalDateTime;

/**
 * @author kosuke
 */
public class AccessContextHelper {

	public interface Invoker {
		Object invoke() throws Throwable;
	}

	/**
	 * 共通カラムの設定を挟み込んで実行する
	 */
	public Object invoke(String methodModuleName, Invoker invoker) throws Throwable {
		if (AccessContext.isExistAccessContextOnThread()) {
			// 既に設定されていたら何もしないで次へ
			// (二度呼び出しされたときのために念のため)
			return invoker.invoke();
		}

		try {
			AccessContext context = new AccessContext();
			context.setAccessLocalDateTime(LocalDateTime.now());
			context.setAccessModule(methodModuleName);
			context.setAccessProcess("process");
			AccessContext.setAccessContextOnThread(context);
			return invoker.invoke();
		} finally {
			AccessContext.clearAccessContextOnThread();
		}
	}

	private boolean setupCommonColumn(String methodModuleName) {
		if (AccessContext.isExistAccessContextOnThread()) {
			return false;
		}


		// AccessContext設定
		AccessContext context = new AccessContext();
		context.setAccessLocalDateTime(LocalDateTime.now());
		context.setAccessModule(methodModuleName);
		context.setAccessProcess("process");
		AccessContext.setAccessContextOnThread(context);
		return true;
	}
}