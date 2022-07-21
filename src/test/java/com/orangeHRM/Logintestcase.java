package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Logintestcase  extends BaseClass{
	public static void login (String username,String password)
	{

	    driver.findElement(By.id("txtUsername")).sendKeys(username);
	    driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("spanMessage")).isDisplayed())
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
	}
	public static void forgotpass()
	{
		WebElement restUsername=null;
			driver.findElement(By.partialLinkText("Forgot your")).click();
			restUsername=driver.findElement(By.id("securityAuthentication_userName"));
			restUsername.sendKeys("test@test.com");
			driver.findElement(By.id("btnSearchValues")).click();
	if (driver.findElement(By.xpath("//div[@id=\"divLogo\"]/following::div[3]")).isDisplayed())
    {
    	System.out.println("Warning msg is displayed");
	}
    else
    {
    	System.out.println("test fail");
    }

		}
	public static void AddEmp(String emp,String lastname) {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(emp);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		driver.findElement(By.id("btnSave")).click();
	}
	public static void Search(String emp,String lastname) {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		WebElement empSearch=driver.findElement(By.id("empsearch_employee_name_empName"));
		empSearch.clear();
		empSearch.click();
		empSearch.sendKeys("swapnil");
		driver.findElement(By.id("searchBtn")).click();
	}
	public static void Logout() {
		driver.findElement(By.id("welcome")).click();
		Util.waitForElementToClick(By.linkText("Logout"));
		driver.findElement(By.linkText("Logout")).click();
	    
	}
	public static void DropDown() throws Exception {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement empStatusDropDown=driver.findElement(By.id("empsearch_employee_status"));
		Select select=new Select(empStatusDropDown);
		select.selectByIndex(1);
		select.selectByVisibleText("Full-Time Contract");
		select.selectByValue("4");
//	     select.deselectAll();
//	    select.deselectByIndex(1);   
//	    select.deselectByValue(null);
//	    select.deselectByVisibleText(null);
	    List<WebElement> allDropDownValues=select.getOptions();
		for(WebElement element: allDropDownValues) {
			System.out.println(element.getText());
			if(element.getText().equals("Freelence")) {
				throw new Exception("Freelence value is present in the Employee Status DropDown");
				}
			}
		driver.findElement(By.id("searchBtn")).click();
	}
	public static void EmployeeList() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).clear();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("swapnil bendage");
		driver.findElement(By.id("empsearch_id")).clear();
		driver.findElement(By.id("empsearch_id")).sendKeys("0297");
		driver.findElement(By.id("searchBtn")).click();
	}
	

	public static void main(String[] args) throws Exception {
		
		launchBrower ("chorme");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		login ("","");
		login("Admin","");
		login("admin","swapnil");
		
		forgotpass();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		AddEmp("swapnil","bendage");
        AddEmp("Kallyani","Bhute");
        AddEmp("","Admin");
        AddEmp("","");
        
        Search("swapnil","bendage");
        Search("Kallyani","Bhute");
        Search("","Admin");
        Search("","");
        DropDown();
        EmployeeList();
        
        
        
        
       Logout();
		

	}
	
}

