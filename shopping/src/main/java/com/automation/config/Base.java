package com.automation.config;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	WebDriver driver;
	
	public void startBrowser() {
		
		System.setProperty("", "");
		
		driver= new FirefoxDriver();
		System.out.println("Added By Dinesh");
		}
	public int add(int a, int b) {
		int c;
		return c =(a+b);
	}
	

	}
