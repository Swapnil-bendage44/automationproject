package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends BaseClass {

	public static void main(String[] args) throws Exception {
		launchBrower("chorme");
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement empStatusDropDown=driver.findElement(By.id("empsearch_employee_status"));
		Select select=new Select(empStatusDropDown);
		select.selectByIndex(1);
		
		select.selectByVisibleText("Full-Time Contract");
		
	    select.selectByValue("4");
	    
	    select.deselectAll();
	    
	    select.deselectByIndex(1);
	    
	    select.deselectByValue(null);
	    
	    select.deselectByVisibleText(null);
	    
		List<WebElement> allDropDownValues=select.getOptions();
		for(WebElement element: allDropDownValues) {
			System.out.println(element.getText());
			if(element.getText().equals("Freelence")) {
				throw new Exception("Freelence value is present in the Employee Status DropDown");
				
				
			}
		}
		

	}

}
