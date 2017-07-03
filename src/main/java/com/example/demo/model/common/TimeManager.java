package com.example.demo.model.common;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kosuke
 */
@Component
public class TimeManager {

	/** trueの場合、直接指定で時間を制御する。false(デフォルト)の場合、 現在時刻からの相対時間で時間を制御する */
	protected boolean absoluteTimeMode;

	/** 直接指定の場合、絶対時間。相対指定の場合、相対時間 */
	protected long adjustTime;


	/**
	 * 現在時刻を返します
	 * @return
	 */
	public LocalDateTime getCurrentLocalDateTime() {
		return LocalDateTime.ofInstant(getCurrentDate().toInstant(), ZoneId.systemDefault());
	}

	/**
	 * 現在時刻を返します。
	 * @return
	 */
	public Date getCurrentDate() {
		if (absoluteTimeMode) {
			return new Date(adjustTime);
		} else {
			return new Date(System.currentTimeMillis() + adjustTime);
		}
	}

	/**
	 * 現在時刻（Timestamp型）を返します。
	 * @return
	 */
	public Timestamp getCurrentTimestamp() {
		if (absoluteTimeMode) {
			return new Timestamp(adjustTime);
		} else {
			return new Timestamp(System.currentTimeMillis() + adjustTime);
		}
	}

	/**
	 * 現在時刻（Calendar型）を返します。
	 * @return
	 */
	public Calendar getCurrentCalendar() {
		Calendar calendar = Calendar.getInstance();
		if (absoluteTimeMode) {
			calendar.setTime(new Date(adjustTime));
		} else {
			calendar.setTime(new Date(System.currentTimeMillis() + adjustTime));
		}
		return calendar;
	}
}
