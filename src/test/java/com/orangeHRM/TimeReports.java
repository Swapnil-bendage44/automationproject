package com.orangeHRM;

import org.openqa.selenium.By;

public class TimeReports extends BaseClass {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			driver.findElement(By.id("firstName")).sendKeys("Rahul");
			driver.findElement(By.id("lastName")).sendKeys("Birajdar");			
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("menu_time_viewTimeModule")).click();
			driver.findElement(By.id("menu_time_Reports")).click();
			driver.findElement(By.id("menu_time_displayEmployeeReportCriteria")).click();
			driver.findElement(By.id("employee_empName")).click();
			driver.findElement(By.id("employee_empName")).sendKeys("Rahul Birajdar");
			driver.findElement(By.id("viewbutton")).click();
	}

}
