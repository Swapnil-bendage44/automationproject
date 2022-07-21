package com.orangeHRM;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowsHandling extends BaseClass {

	public static void main(String[] args) {
		launchBrower("chorme");
		driver.get("https://www.redbus.in/");
		driver.findElement(By.linkText("Help")).click();
		String parentTabId=driver.getWindowHandle();
		System.out.println(parentTabId);
		Set<String> windowsIds =driver.getWindowHandles();
		System.out.println(windowsIds);
		for(String id:windowsIds) {
			if(!id.equals(parentTabId)) {
				System.out.println(id);
				driver.switchTo().window(id);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentTabId);
			}
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.id("src")).click();
		
	}
}
