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

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Eager;

public class Robot_Oct14 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//actions  for mouse
		
		Actions a=new Actions(driver);
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		a.contextClick(mobiles).build().perform();
		
		//robot for keyboard
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//actions for best sellers
		
		WebElement best_Sellers = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		a.contextClick(best_Sellers).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//actions for electronics
		
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		a.contextClick(electronics).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//windows Handling
		Set<String> windowHandles = driver.getWindowHandles();
		
		for  (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
			
		}
	String s="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for  (String home : windowHandles) {
			if (driver.switchTo().window(home).getTitle().equalsIgnoreCase(s)) {
				break;
				
			}
			
		}
		

	}

}
