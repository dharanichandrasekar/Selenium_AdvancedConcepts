package com.SeleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintoutGoogleSearchResultsTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Setup_files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		
		WebElement searchTextbox= driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Ponniyin selvan");		
		Thread.sleep(5000);
		
		List<WebElement> searchSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

		for(WebElement webElement:searchSuggestions) {
			System.out.println(webElement.getText());
		}
		
		driver.close();
	
	}

}
