package com.example.demo.model;

import com.example.demo.model.common.TimeManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kosuke
 */
public abstract class AbstractModel {

	@Autowired
	protected TimeManager timeManager;

	protected void assertNotNull(Object... args) {
		if (args == null) {
			throw new IllegalArgumentException("args is null!!");
		}
		int number = 1;
		for (Object arg : args) {
			if (arg == null) {
				throw new IllegalArgumentException("arg" + number + " is null!!");
			}
			++number;
		}
	}
}
