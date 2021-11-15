package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_Oct20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
//driver.manage().window().maximize();
		WebElement java = driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[3]/a"));
		java.click();
		Thread.sleep(10000);
		WebElement mcq = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[19]/a[22]"));
		mcq.click();

	}

}
