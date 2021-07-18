package com.selenium.pom;

import com.selenium.webelement.BaseClass_WebElement_Methods;

public class Facebook_Login_POM extends BaseClass_WebElement_Methods {

public static void main(String[] args) {
	
	browserLaunch("chrome");
	openURL("https://www.facebook.com/");
	
	Login_POM login=new Login_POM(driver);
	
	methodToSendkeys(login.getEmail(), "test@gmail.com");
		
	methodToSendkeys(login.getPassword(), "test123");	
	
	methodToClick(login.getLoginClk());
	
}

}
