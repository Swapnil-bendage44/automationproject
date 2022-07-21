package com.orangeHRM;

import org.openqa.selenium.By;

public class AssignLeave extends BaseClass {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
			driver.findElement(By.id("menu_leave_assignLeave")).click();
			driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Rocky");
			driver.findElement(By.xpath("//option[@value=\"9\"")).click();
			driver.findElement(By.id("assignleave[txtFromDate]")).sendKeys("2022-07-15");
			driver.findElement(By.id("assignleave[txtToDate]")).sendKeys("2022-07-15");
			
			
			
		

	}

}
