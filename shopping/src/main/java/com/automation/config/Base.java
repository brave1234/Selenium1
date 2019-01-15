package com.automation.config;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	WebDriver driver;
	
	public void startBrowser() {
		
		System.setProperty("", "");
		
		driver= new FirefoxDriver();
	}
	/*
	 * This method is created for multiplication
	 */
	public void multiplication() {
		System.out.println("Multiplication is =");
	}
	



	}
