package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PATAMA\\eclipse-workspace\\Selenium_Start\\Driver\\chromedriver_win32\\chromedriver.exe ");
	//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//driver.manage().window().maximize();
		
		//isMultiple
		
		WebElement  multi = driver.findElement(By.id("multi-select"));
		Select s=new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println("Check the type of dropdown "  +multiple);
		
		//getOptions
		
		List<WebElement> options = s.getOptions();	
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println("Options available "  +text);
			
		}
	  int size = options.size();
	  System.out.println("Total Number of Cities available "  +size);
	  
	  
	  //selectByIndex   
	  
	  for (int i = 0; i < size; i++) {
		if(i==0||i==2||i==5) {
			s.selectByIndex(i);			
		}
	}
	  //getAllSelectedOptions
	 List<WebElement> options1  = s.getAllSelectedOptions(); 
	 for (WebElement webElement1 : options1) {
		 String text1 = webElement1.getText();
		 System.out.println("Display the selected cities "  +text1);
		
	}
	//getFirstSelectedOption
	 WebElement firstSelected = s.getFirstSelectedOption();
	String text3 = firstSelected.getText();
	System.out.println("First selected city is "  +text3);	
	
	//s.deselectByIndex(2);
	System.out.println("Deselect selected city");
	s.deselectByValue("Texas");
	s.deselectByVisibleText("California");
	
	//deSelectByValue
	//s.deselectByValue();
	
	//deSelectAll
	//s.deselectAll();
		
	}

}
