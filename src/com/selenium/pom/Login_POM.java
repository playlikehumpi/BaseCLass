package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Login_POM {
	
   public static WebDriver driver;
	
	
	public Login_POM(WebDriver driver) {
		
	this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password; 
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginClk;


	public WebElement getLoginClk() {
		return loginClk;
	}

	
	
	

}
