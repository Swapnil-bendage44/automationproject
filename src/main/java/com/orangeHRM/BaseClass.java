package com.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void launchBrower(String browsername){
		
		switch(browsername) {
		 
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		break;
		default:
				WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
		
	}
}
		
	
	

