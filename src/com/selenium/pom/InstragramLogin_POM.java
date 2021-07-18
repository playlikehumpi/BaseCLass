package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstragramLogin_POM {
	
	public static WebDriver driver;
	
	
	public InstragramLogin_POM(WebDriver driver) {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
	  
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginClk() {
		return loginClk;
	}

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'L3NKy   ')]")
	private WebElement loginClk;
	
	
	
	

}
