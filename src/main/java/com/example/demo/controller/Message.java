package com.example.demo.controller;

import java.io.Serializable;

/**
 * @author kosuke
 */
public class Message implements Serializable {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
