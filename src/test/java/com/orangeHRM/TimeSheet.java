package com.orangeHRM;

import org.openqa.selenium.By;
 class TimeSheet extends BaseClass {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_time_viewTimeModule")).click();
			driver.findElement(By.id("employee")).click();
			driver.findElement(By.id("employee")).clear();
			driver.findElement(By.id("employee")).sendKeys("Ganesh Mule");
			driver.findElement(By.id("btnView")).click();
			
	}

}
