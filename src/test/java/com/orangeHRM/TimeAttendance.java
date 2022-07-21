package com.orangeHRM;

import org.openqa.selenium.By;

public class TimeAttendance extends BaseClass{

	public static void main(String[] args) {
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_time_viewTimeModule")).click();
			driver.findElement(By.id("menu_attendance_Attendance")).click();
			driver.findElement(By.id("menu_attendance_viewAttendanceRecord")).click();
			driver.findElement(By.id("attendance_employeeName_empName")).clear();
			driver.findElement(By.id("attendance_employeeName_empName")).sendKeys("Rahul Birajdar");
			driver.findElement(By.id("attendance_date")).clear();
			driver.findElement(By.id("attendance_date")).sendKeys("2022-07-15");
			driver.findElement(By.id("btView")).click();
			driver.findElement(By.id("btnPunchOut")).click();
			driver.findElement(By.id("btnPunch")).click();
			
	}

}
