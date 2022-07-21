package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchAppliances extends BaseClass{

	public static void main(String[] args) {
		launchBrower("chrome");
		driver.get("https://www.amazon.in/");
		WebElement searchDropdown=driver.findElement(By.id("searchDropdownBox"));
		//WebElement searchDropdownBox = null;
		Select select=new Select(searchDropdown);
		select.selectByVisibleText("Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> result=driver.findElements(By.xpath("//div[starts-with(@cel_widget_id,'MAIN-SEARCH_RESULTS')]/descendant::h2[1]"));
		driver.findElement(By.className("a-price-whole"));
		for(WebElement element:result) {
		String resultDetails=element.getText();
		System.out.println(resultDetails);
		}
	}

}
