package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MaxWindowScreenUsingTestNGTesting {

	@Test
	public void maxWindowScreenOne() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); //1st method : manage.windows.maximize option
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("India"+Keys.ENTER);
		
		Thread.sleep(3000);
		System.out.println("1st Method: Window screen is maximized");
		driver.close();
	}
	
	@Test
	public void maxWindowScreenTwo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		
		Dimension dimension=new Dimension(1300,600);
		driver.manage().window().setSize(dimension); //2nd method : SetSize of dimension option
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Thanjore Big Temple"+Keys.ENTER);
		
		Thread.sleep(3000);
		System.out.println("2nd method: Window screen is maximized using the dimension");
		driver.close();
	}
	
	@Test
	public void maxWindowScreenThree() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions chromeoptions=new ChromeOptions(); // 3rd method: chromeOptions arguments method
		chromeoptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.navigate().to("https://google.com");
	
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Kanyakumari image"+Keys.ENTER);
		
		Thread.sleep(3000);
		System.out.println("3rd method: using Chrome options --start--maxmized method");
		driver.close();
	}
	

}
