package com.SeleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnterKeyTesting {

	public static void main(String[] args) throws AWTException {

		//->>> Different Ways to press enter key to perform Google search <<<-

		//1. driver.sendkeys("xxx"+keys.Enter);
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://google.co.in");		
		WebElement searchTexbox=driver.findElement(By.name("q"));
		searchTexbox.sendKeys("Today's Current Time"+Keys.ENTER);
		System.out.println("Mthod-1: Pressing the Enter Key in searchTextbox by using sendkeys method");
		driver.close();

		//2. driver.sendkeys("xxx" \n);

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://google.co.in");		
		searchTexbox=driver.findElement(By.name("q"));
		searchTexbox.sendKeys("Today's Gold Rate \n");
		System.out.println("Mthod-2: Pressing the Enter Key in the serach Textbox by using the \n method");
		driver.close();

		//3. driver.submit();

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.navigate().to("https://google.co.in");		
		searchTexbox=driver.findElement(By.name("q"));
		searchTexbox.sendKeys("Latest Tamil movies list");
		searchTexbox.submit();
		System.out.println("Mthod-3: Pressing the Enter Key in the serach Textbox by using the submit method");
		driver.close();

		//4. By using Robot class:

		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.navigate().to("https://google.co.in");		
		searchTexbox=driver.findElement(By.name("q"));
		searchTexbox.sendKeys("Robot");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Mthod-4: Pressing the Enter Key in the serach Textbox by using the Robot method");
		driver.close();

		driver.quit();

	}

}
