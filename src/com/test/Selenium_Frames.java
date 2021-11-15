package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe ");
	//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		//WebElement single_Frame = driver.findElement(By.id("singleframe"));
		//single_Frame.click();
		//driver.switchTo().frame(2);
		WebElement multiple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiple.click();
		WebElement multi_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(multi_Frame);
        WebElement inner_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(inner_Frame);
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Padmavathi");
		

	    
	}
}
