package com.orangeHRM;

import org.openqa.selenium.By;

public class EmployeeList extends BaseClass {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
			driver.findElement(By.id("empsearch_employee_name_empName")).clear();
			driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Rahul Birajdar");
			driver.findElement(By.id("empsearch_id")).clear();
			driver.findElement(By.id("empsearch_id")).sendKeys("0315");
			driver.findElement(By.id("searchBtn")).click();
	}
}
