package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_WebDriver_Methods {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "F:\\Eclipse Workarea\\BaseCLass\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FIREFOX")) {

			System.setProperty("webdriver.gecko.driver", "F:\\Eclipse Workarea\\BaseCLass\\Driver\\chromedriver.exe");

			WebDriver driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser name");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void browserClose() {

		driver.close();

	}

	public static void browserQuit() {
		driver.quit();

	}

}
