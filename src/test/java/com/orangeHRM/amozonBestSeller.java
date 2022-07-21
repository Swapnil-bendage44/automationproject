package com.orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class amozonBestSeller extends BaseClass{

	public static void main(String[] args) throws AWTException {
		BaseClass.launchBrower("chorme");
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//div[@id=\'nav-xshop\']"))).build().perform();
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String ParentTabId=driver.getWindowHandle();
		System.out.println(ParentTabId); 
		Set<String> WindowsIds=driver.getWindowHandles();
		System.out.println(WindowsIds);
		
		
		
		
		
	}

}
