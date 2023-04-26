package com.SeleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefreshUsingTestNGTesting {

	@Test
	public void googleFirstBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("India");
		
		driver.getCurrentUrl(); // page refresh
		System.out.println("1.Page Refreshed using getCurrentUrl method");
		driver.close();
	}
	
	@Test
	public void googleSecondBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Thanjore Big Temple");
		
		driver.navigate().refresh(); //page refresh 
		System.out.println("2. Page Refreshed using navigate().refresh() method");
		driver.close();
	}
	
	@Test
	public void googleThirdBrowser() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Taj Mahal");
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_5);
		robot.keyRelease(KeyEvent.VK_5); //page refresh
		System.out.println("3. Page Refreshed using Robot method by pressing F5key");
		driver.close();
	}

	@Test
	public void googleForthBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("TamilNadu");
		
		JavascriptExecutor executor=(JavascriptExecutor) driver; 
		executor.executeScript("location.reload");//page refresh 
		//executor.executeScript("histroy.go(0)");//page refresh
		System.out.println("4. Page Refreshed using JavaScript Executor method");
		driver.close();
	}
}
