package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTesting {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		// Enter the website
		driver.navigate().to("https://phptravels.net/login");
		driver.manage().window().maximize();

		WebElement Username=driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
		Username.sendKeys("asp@test.com"+Keys.ENTER);

		WebElement Password=driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
		Password.sendKeys("testing123$"+Keys.ENTER);

		WebElement LoginButton = driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		LoginButton.click();
		
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30)); //getting error here
	//	WebElement MyProfileUpdateOption= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a")));
		
		//driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a"));
	//	MyProfileUpdateOption.click();

		WebElement UpdateFirstNameField= driver.findElement(By.xpath("//*[@id='fadein']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/input[1]"));
		UpdateFirstNameField.sendKeys("EditedFirstName"+Keys.ENTER);

		WebElement UpdateButton =driver.findElement(By.xpath("//*[@id='fadein']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
		UpdateButton.click();
		driver.close();
	}

}
