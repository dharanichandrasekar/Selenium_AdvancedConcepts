package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTesting {

	public static void main(String[] args) {
		// ******** WebDriver Manager**********

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		
		WebElement googleTextbox=driver.findElement(By.name("q"));
		googleTextbox.sendKeys("WebDriver Manger concept in Selenium" +Keys.ENTER);
		
		driver.close();

	}

}
