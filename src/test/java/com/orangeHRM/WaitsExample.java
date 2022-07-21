package com.orangeHRM;

import org.openqa.selenium.By;

public class WaitsExample extends BaseClass{
	public static void main(String[]args) {
		BaseClass.launchBrower("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Logintestcase.login("Admin","admin123");
		try {
		if(driver.findElement(By.id("spanMessage")).isDisplayed()){
			String errorMessage= driver.findElement(By.id("spanMessage")).getText();
			System.out.println(errorMessage);
			}
			}
		catch(Exception e) {
			System.out.println("The Error message is not avaliable on login screen");
			
		}
	}

}
