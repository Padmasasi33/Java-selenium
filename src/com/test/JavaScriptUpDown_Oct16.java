package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUpDown_Oct16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://ta-in.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='abc@gmail.com';",email);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		js.executeScript("arguments[0].value='padma@123';",password);
		Thread.sleep(3000);
		
		WebElement enter = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		js.executeScript("arguments[0].click();", enter);

	}

}
