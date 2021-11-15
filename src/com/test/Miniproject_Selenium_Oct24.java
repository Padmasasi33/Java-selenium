package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miniproject_Selenium_Oct24 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		WebElement dresses = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[2]"));
		dresses.click();

		WebElement casual_Dresses = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
		casual_Dresses.click();
		Thread.sleep(4000);

		WebElement printed_Dresses = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		printed_Dresses.click();

		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
		quantity.click();

		WebElement quantity1 = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
		quantity1.click();

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add_to_cart\"]/button/span")));

		WebElement addto_Cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addto_Cart.click();

		Thread.sleep(10000);

		WebElement proceed_To_Checkout = driver
				.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed_To_Checkout.click();

		Thread.sleep(3000);

		WebElement check_Out = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		check_Out.click();

		// WebDriverWait wait1=new WebDriverWait(driver, 50);
		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"layer_cart\\\"]/div[1]/div[2]/div[4]/a/span"))).click();;

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
		email.sendKeys("tholshisarvesh2@gmail.com");

		WebElement create_Account = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		create_Account.click();

		Thread.sleep(5000);

		WebElement title = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		title.click();

		WebElement first_name = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		first_name.sendKeys("Padmavathi");

		WebElement last_name = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		last_name.sendKeys("Chokkalingam");

		// WebElement email1 = driver.findElement(By.xpath("(//*[@id=\"email\"]"));
		// email1.sendKeys("tholshi@gmail.com");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("123456@a");

		WebElement date = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select s = new Select(date);
		s.selectByValue("5");

		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select s1 = new Select(month);
		s1.selectByIndex(1);

		WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select s2 = new Select(year);
		s2.selectByValue("1992");

		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[8]/label")).click();

		/*
		 * WebElement first_name1 =
		 * driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		 * first_name1.sendKeys("Padmavathi");
		 * 
		 * WebElement last_name1 =
		 * driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		 * last_name1.sendKeys("Chokkalingam");
		 */

		WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		company.sendKeys("abs solutions");

		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address.sendKeys("Tambaram");

		WebElement street = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		street.sendKeys("suthershan Nagar");

		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("chennai");

		WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select s3 = new Select(state);
		s3.selectByIndex(4);

		driver.findElement(By.id("postcode")).sendKeys("60126");

		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select s4 = new Select(country);

		driver.findElement(By.name("other")).sendKeys("Door No:7a");
		driver.findElement(By.name("phone")).sendKeys("260341");
		driver.findElement(By.name("phone_mobile")).sendKeys("9234589087");
		driver.findElement(By.name("alias")).clear();
		driver.findElement(By.name("alias")).sendKeys("Tirunelveli");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();

		Thread.sleep(3000);

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		proceed.click();

		driver.findElement(By.name("cgv")).click();

		WebElement proceed_To = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		proceed_To.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll up and down
		js.executeScript("window.scroll(0,300)", "");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Screenshot\\proj.png");
		FileUtils.copyFile(source, destination);

	}

}
