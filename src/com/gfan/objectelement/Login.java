package com.gfan.objectelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public static WebElement element = null;

	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.xpath("id('loginName')"));
		return element;

	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("id('password')"));
		return element;

	}

	public static WebElement authcode(WebDriver driver) {
		element = driver.findElement(By.xpath("id('authCode')"));
		return element;

	}

	public static WebElement code(WebDriver driver) {
		element = driver.findElement(By.xpath("id('imageCaptcha')"));
		return element;

	}

	public static WebElement changecode(WebDriver driver) {
		element = driver.findElement(By.xpath("id('changeCaptcha')"));
		return element;

	}

	public static WebElement codenotnull(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("id('loginForm')/x:fieldset/x:div[4]/x:div[2]/x:span[1]"));
		return element;

	}

	public static WebElement forgerpasswd(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("id('loginForm')/x:fieldset/x:div[5]/x:div/x:label[4]/x:a"));
		return element;

	}

	public static WebElement loginBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("id('regInputBt')"));
		return element;

	}

	public static WebElement register(WebDriver driver) {
		element = driver.findElement(By
				.xpath("id('loginForm')/x:fieldset/x:div[6]/x:div/x:p/x:a"));
		return element;

	}

}
