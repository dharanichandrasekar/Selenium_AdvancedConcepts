package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGetandNavigateToMethodTesting {

	public static void main(String[] args) {
		// ********* Without Get method and NavigateTo method , how can get the URL ? **********

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//JavaScript Method 
		String googlePageURL="https://www.google.co.in";
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.location= \' "+googlePageURL+" \'");
		
		WebElement googleTextbox=driver.findElement(By.name("q"));
		googleTextbox.sendKeys("Selenium Interview questions \n");
		
		driver.close();
	}

}
