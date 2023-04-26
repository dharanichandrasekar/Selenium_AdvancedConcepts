package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSystemSetPropertyTesting {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		// We need to configure the chromedriver path location in the environment variables segment in system
		driver.navigate().to("https://google.co.in"); 
		
		WebElement googleSearchBox=driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("Without System.SetProperty option for launching the chrome in selenium"+Keys.ENTER);
		
		System.out.println("Without System.SetProperty option, we have launched the chrome in selenium by using the environment variable property in system");
		driver.close();
	}

}
