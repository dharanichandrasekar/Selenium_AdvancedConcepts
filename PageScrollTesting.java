package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollTesting {

	public static void main(String[] args) throws InterruptedException {
		// >> How to scroll a web page <<

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();

		// JavaScriptExecutor method
		JavascriptExecutor executor=(JavascriptExecutor)driver;

		// 1. How to scroll down to a specific position?
		executor.executeScript("window.scroll(0,450)"," " );
		Thread.sleep(5000);
		System.out.println("Scrolled UP Done!");
		
		// 2. How to scroll up to a specific position?
		executor.executeScript("window.scroll(0, -450)"," " );
		Thread.sleep(5000);
		System.out.println("Scrolled Down Done!");

		// 3. How to scroll to the bottom of the page?
		// 4. How to scroll to the top of the page?
		// 5. How to scroll to a position where a specific web element is present?
		// 6. How to use the Robot class to scroll a web page?

	}

}
