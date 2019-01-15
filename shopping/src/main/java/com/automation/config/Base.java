package com.automation.config;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	WebDriver driver;
	
	public void startBrowser() {
		
		System.setProperty("", "");
		
		driver= new FirefoxDriver();
	}
	
	
	/**
	 * This method is created for addition
	 * **/
	public void add() {
		System.out.println("This is kabita");
		System.out.println("This is kabita gautam");

	}
	public void sub() {
		System.out.println("I am inside sub method of calc");
		
	}}



	
