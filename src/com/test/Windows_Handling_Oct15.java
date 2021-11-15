package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling_Oct15 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		Actions a=new Actions(driver);
		WebElement Top_Offers = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]"));
        a.contextClick(Top_Offers).build().perform();
        
        Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement grocery = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]"));
        a.contextClick(grocery).build().perform();
        
       
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]"));
        a.contextClick(mobiles).build().perform();
        
        
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
			
		}
		String s="Mobile Phones: The Big Billion Days Sale starts from 3rd October";
		for (String mobile : windowHandles) {
			if (driver.switchTo().window(mobile).getTitle().equalsIgnoreCase(s)) {
				break;
				
			}
		}
		driver.close();
	}
	

}
