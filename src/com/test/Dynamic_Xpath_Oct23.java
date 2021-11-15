package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Collections2;

public class Dynamic_Xpath_Oct23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		List<WebElement> products = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for (int i = 0; i < products.size(); i++) {
			String replaceAll = products.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
		}
		int size = a.size();
		System.out.println(size);
		System.out.println("min price of the list :" + Collections.min(a));
		System.out.println("min price of the list :" + Collections.max(a));

	}

}
