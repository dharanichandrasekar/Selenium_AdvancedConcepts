package com.SeleniumAdvancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConceptsTesting {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1. Navigate().To() Method:
		driver.navigate().to("https://demoqa.com/elements");
		System.out.println("The page is Navigated-To corresponding page");
		driver.manage().window().maximize();

		WebElement TextboxTab=driver.findElement(By.xpath("//*[@id='item-0']/span"));
		TextboxTab.click();

		WebElement FullNameTextbox=driver.findElement(By.xpath("//*[@id='userName']"));
		FullNameTextbox.sendKeys("Dharani chandrasekar");

		WebElement EmailTextbox=driver.findElement(By.xpath("//*[@id='userEmail']"));
		EmailTextbox.sendKeys("testing@gmail.com");

		WebElement CurrentAddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
		CurrentAddress.sendKeys("Google street, NewYork city, Wasington, USA."+Keys.ENTER);

		WebElement PermanantAddress=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		PermanantAddress.sendKeys("Google street, NewYork city, Wasington, USA."+Keys.ENTER);

		//WebElement SubmitButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
		//SubmitButton.click();


		// 2. Navigate().Refresh() Method:
		driver.navigate().refresh();
		System.out.println("The page is Re-freshed");

		// 3. Navigate().Back() Method:
		driver.navigate().back();
		System.out.println("The page is Navigated-Back to the corresponding page");

		// 4. Navigate().forward() Method:
		driver.navigate().forward();
		System.out.println("The page is Navigated-forwarded to the corresponding page");

		driver.quit();
		System.out.println("The driver is Quited");
	}

}
