package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Oct16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Scroll up and down
		js.executeScript("window.scroll(0,2000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,-500)","");//-sign means up
		Thread.sleep(3000);
		//Element click
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		js.executeScript("arguments[0].click();",mobile);
		Thread.sleep(3000);
		//Specific Element
		WebElement block_Buster = driver.findElement(By.xpath("//*[@id=\"CardInstancenAefL3ToxUZlwzw4pd_Gkg\"]/div[3]/div/div/a/span"));
		js.executeScript("arguments[0].scrollIntoView(true);", block_Buster);
		

	}

}
