package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorex extends BaseClass {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://realestateautomation.agilecrm.com/login?ml=true");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("automation@yopmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test1234");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement signInButton=driver.findElement(By.xpath("//input[@value=\"Sign In\"]"));
		js.executeScript("arguments[0].click();",signInButton);
		js.executeScript("arguments[0].click();",signInButton);
		System.out.println(js.executeScript("return document.domain;"));
		js.executeScript("arguments[0].click();",signInButton);
		System.out.println(js.executeScript("return document.URL;"));
		js.executeScript("window.scrollBy(0,10000);");
		
		//js.executeScript("window.scrollBy(0,-10000);");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		
		
		
	}

}
