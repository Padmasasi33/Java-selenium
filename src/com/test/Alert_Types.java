package com.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe ");
	//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//simple alert
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		
		Thread.sleep(3000);
		//Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		
		//confirm alert
		WebElement confirm_Alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm_Alert.click();
		
		WebElement click_Button = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		click_Button.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		//prompt alert
		
		WebElement text_Box = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		text_Box.click();		
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Padmavathi");
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		

	}

}
