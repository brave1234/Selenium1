package com.automation.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
	/**
	 * this method is created by anjana
	 * **/
	public void dropdown() {
	
		Select sel = new Select(driver.findElement(By.id(".....")));
		sel.selectByVisibleText(".....");
	}
	public void sub() {
	System.out.println("I am inside sub method of calc");
		
	}
	
	public void div( ) {
		int x=20;
	    int y=30;
	    int z=x/y;
	    System.out.println("value of z="+z);
	}
	
	
	public void sel() {
		System.out.println("Updated by Bikram");
		
	}
	
	public void gotomeeting() {
		
		System.out.println("changes done by tushar");
	}
	
	public void gotomeeting2() {
		  
		  System.out.println("changes done by Kabita");
		 }

	

  public void HelloEveryone() {
	  System.out.println("hello its me prashant everyone");
  }
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println("Current url is - "+ driver.getCurrentUrl());
		
	}

}



	
