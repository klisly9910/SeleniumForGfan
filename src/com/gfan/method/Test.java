package com.gfan.method;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.gfan.utils.Browser;

public class Test {
	static final Logger logger = LogManager.getLogger(Test.class.getName());

	@BeforeTest
	public void startBrowser() {
		Browser.launchBrowser("firefox");
		Browser.launchBrowser("chrome");
		Browser.launchBrowser("iexplore");
	}

	@org.testng.annotations.Test
	public void baidu() {
		// DOMConfigurator.configure("E:\\GitHub\\SeleniumForGfan\\log4j.xml");
		Browser.driver.findElement(By.id("kw")).sendKeys("java");
		Browser.driver.findElement(By.id("su")).click();

	}

	@AfterTest
	public void closeBrowser() {
		Browser.driver.close();
	}

}
