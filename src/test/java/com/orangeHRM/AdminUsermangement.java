package com.orangeHRM;

import org.openqa.selenium.By;

public class AdminUsermangement extends Logintestcase  {

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			driver.findElement(By.id("firstName")).sendKeys("Swapnil");
			driver.findElement(By.id("lastName")).sendKeys("Bendage");			
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("btnAdd")).click();
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Swapnil Bendage");
			driver.findElement(By.id("systemUser[userName]")).sendKeys("sb123");
			driver.findElement(By.id("systemUser_password")).sendKeys("swapnil@123");
			driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("swapnil@123");
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys("sb123");
			driver.findElement(By.id("searchBtn")).click();
			driver.findElement(By.id("ohrmList_chkSelectRecord_53")).click();
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			driver.close();
	}

}
