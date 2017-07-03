

/* Create Tables */

CREATE TABLE ACCOUNT
(
	ACCOUNT_ID bigint NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'アカウントID',
	ACCOUNT_NAME varchar(30) NOT NULL COMMENT 'アカウント名',
	ACCOUNT_DISPLAY_ID varchar(30) NOT NULL UNIQUE COMMENT 'アカウント表示ID',
	FIRST_NAME varchar(30) COMMENT '苗字',
	LAST_NAME varchar(30) COMMENT '名前',
	EMAIL_ADDRESS varchar(256) NOT NULL COMMENT 'メールアドレス',
	PASSWORD varchar(256) NOT NULL COMMENT 'パスワード',
	ACCOUT_STATUS_CD char(3) NOT NULL COMMENT 'アカウントステータス',
	INS_DATETIME datetime NOT NULL COMMENT '登録日時',
	INS_TRACE varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPD_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPD_TRACE varchar(200) NOT NULL COMMENT '更新ユーザー',
	PRIMARY KEY (ACCOUNT_ID)
) COMMENT = 'アカウント';



