package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());			
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/h2"));
		System.out.println(title.getText());
		

	}

}
