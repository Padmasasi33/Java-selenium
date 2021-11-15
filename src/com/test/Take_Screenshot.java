package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement mailId = driver.findElement(By.id("email"));
		mailId.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("122");
		//WebElement create_Acc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		//create_Acc.click();
		//Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Screenshot\\facebook.png");
		FileUtils.copyFile(source, destination);
		
	}

}
