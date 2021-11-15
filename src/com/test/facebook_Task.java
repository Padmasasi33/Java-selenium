package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement create_Account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create_Account.click();		
				
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		WebElement first_Name = driver.findElement(By.name("firstname"));
		first_Name.sendKeys("Padmavathi");		
		
		WebElement last_Name = driver.findElement(By.xpath("//input[@name='lastname']"));
		last_Name.sendKeys("Chokkalingam");
				
		WebElement mobile_Number = driver.findElement(By.name("reg_email__"));
		mobile_Number.sendKeys("1234567890");
		
		WebElement new_Password = driver.findElement(By.id("password_step_input"));
		new_Password.sendKeys("padma@321");
		
		WebElement date = driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("23");
		 
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(0);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("2000");
		
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		
		
		
		
		
	
		
		

	}

}
