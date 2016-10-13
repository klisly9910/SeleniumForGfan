package com.gfan.objectelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchObject {
	public static WebElement element = null;

	public static WebElement searchText(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/x:html/x:body/x:div[2]/x:div/x:div[1]/x:div/x:form/x:input[11]"));
		return element;

	}
	public static WebElement searchBtn(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/x:html/x:body/x:div[2]/x:div/x:div[1]/x:div/x:form/x:input[12]"));
		return element;

	}

}
