package com.project.Oct_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_project {
	public static void main(String[] args) {
		
		
		
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\JavaProjectDemo\\Driver\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/buttons");
			
			
		}

}
