package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SetProperty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		// upcasting

		WebDriver driver = new ChromeDriver();
		driver.get("https://ta-in.facebook.com/");
		driver.manage().window().maximize();
		// driver.navigate().to(
		// "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=12374445503163117560&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIn9Xm-sSp8wIVUDErCh3OwAOOEAAYASAAEgK6-fD_BwE");
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();
		// String currentUrl = driver.getCurrentUrl();
		// System.out.println(currentUrl);

		 System.out.println(driver.getTitle());

		// System.out.println(driver.getPageSource());
		// Dimension d=new Dimension(500, 500);
		// driver.manage().window().setSize(d);
		// Point p=new Point(250,250);
		// driver.manage().window().setPosition(p);
		WebElement mailId = driver.findElement(By.id("email"));
		mailId.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("122");
		WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		
		Thread.sleep(10000);
		WebElement first_Name = driver.findElement(By.xpath("//*[@id=\"u_3_b_1w\"]"));
		first_Name.sendKeys("Chokkalingam");
		 
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_8_b_W/\"]"));
		lastName.sendKeys("sasi");
		WebElement day = driver.findElement(By.id("//select[@id='day']"));
		day.sendKeys("fff");

	
	}

}
