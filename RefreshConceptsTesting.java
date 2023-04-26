package com.SeleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.math3.ml.neuralnet.twod.util.LocationFinder.Location;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.page.Page.GetNavigationHistoryResponse;

public class RefreshConceptsTesting {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1) getCurrentUrl() method for Refreshing the page
		driver.get("https://google.com");
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("India");
		driver.getCurrentUrl(); // page refresh
		System.out.println("1.Page Refreshed using getCurrentUrl method");
		driver.close();
		
		//2) Navigate.Refresh() method for Refreshing the page
		driver.navigate().to("https://google.com");
		searchTextbox.sendKeys("Thanjore Big Temple");
		driver.navigate().refresh(); //page refresh 
		System.out.println("2. Page Refreshed using navigate().refresh() method");
		driver.close();
		
		//3) Robot method - F5 key pressing
		driver.navigate().to("https://google.com");
		searchTextbox.sendKeys("Taj Mahal");
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_5);
		robot.keyRelease(KeyEvent.VK_5); //page refresh
		System.out.println("3. Page Refreshed using Robot method by pressing F5key");
		driver.close();
		
		//4) JavaScript Executor
		driver.navigate().to("https://google.com");
		searchTextbox.sendKeys("TamilNadu");
		
		JavascriptExecutor executor=(JavascriptExecutor) driver; 
		executor.executeScript("location.reload");//page refresh 
		//executor.executeScript("histroy.go(0)");//page refresh
		System.out.println("4. Page Refreshed using JavaScript Executor method");
		driver.close();
		
	}

}
