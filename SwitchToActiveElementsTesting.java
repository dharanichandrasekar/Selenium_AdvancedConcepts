package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElementsTesting {
	static WebElement q;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.co.in");
		/*
		//1. Without findElement , how can pass the values in google SearchTexbox ?
		driver.switchTo().activeElement().sendKeys("Without findElements, passed the values in Textbox \n");
		System.out.println("Without findElements, passed the values in Textbox by using SwitchTo.ActiveElements method");
		driver.close();*/
		
		
		//2. Without findElement & without SwitchTo option, how can pass the values ?
		
		PageFactory.initElements(driver, SwitchToActiveElementsTesting.class);
		
		q.sendKeys("Seleminum Automation testing \n");
		driver.close();
	}

}
