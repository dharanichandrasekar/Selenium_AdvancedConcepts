package com.SeleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeysTesting {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		//1.With Sendkeys option driver.navigate().to("https://google.co.in");
		driver.manage().window().maximize();

		WebElement searchTexbox=driver.findElement(By.name("q"));
		searchTexbox.sendKeys("Bullet train in India \n"); 
		driver.close();


		//2.Without Sendkeys option
		//JavaExecutor Method
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();

		JavascriptExecutor executor= (JavascriptExecutor) driver;
		//executor.executeScript("document.getElemnetsByName('q')[0].value='Southern Railways' ", "");

		WebElement searchBox=driver.findElement(By.name("q"));
		executor.executeScript("arugments[0].value='Northen Railways'", searchBox);
		driver.close();
		
		
		//3 Robot Method : // Need to enter the word as "Job" 
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		driver.close();
	}
}
