package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe ");
	//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Actions s=new Actions(driver);
		WebElement from_Element = driver.findElement(By.id("draggable"));
		WebElement to_Element = driver.findElement(By.id("droppable"));
	
	   //s.dragAndDrop(from_Element, to_Element).build().perform();
	  s.clickAndHold(from_Element).build().perform();
	  s.moveToElement(to_Element).release().perform();
	
	}
	
		

}
