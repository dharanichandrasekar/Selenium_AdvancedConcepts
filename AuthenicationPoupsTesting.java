package com.SeleniumAdvancedConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenicationPoupsTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000); // To observer the operations
		System.out.println("Sucessfully logged in the  Authenication popups");
		
		driver.close();
	}

}
