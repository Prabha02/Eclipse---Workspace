package com.seleniumconcept;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static WebDriver driver;
	
	private static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); //Local variable

	}
	
	private static void getUrl() {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		driver.close();
		

	}
	
	private static void Login() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7092409923");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Prabha@03");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}
	
	private void Logout() {
		driver.findElement(By.xpath("//div[@aria-label='Menu']")).click();
//		driver.findElement(By.cssSelector(null))

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserLaunch();
		getUrl();
		Login();
		logout
		

	}

}
