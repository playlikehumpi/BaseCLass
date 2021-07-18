package com.selenium.pom;

import com.selenium.webelement.BaseClass_WebElement_Methods;

public class Instagram_Login extends BaseClass_WebElement_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		browserLaunch("CHROME");
		
		openURL("https://www.instagram.com/accounts/login/");
		
		InstragramLogin_POM login=new InstragramLogin_POM(driver);
		
		methodToSendkeys(login.getUsername(), "test@gmail.com");
		
		methodToSendkeys(login.getPassword(), "test");
		
		Thread.sleep(4000);

		methodToClick(login.getLoginClk());
		
		
		
		
		
	}

}
