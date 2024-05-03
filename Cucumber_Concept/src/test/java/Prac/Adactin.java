package Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	
	
	public static WebDriver driver ;
	
	private static void Launch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	private static void getUrl() {
		 driver.get("https://adactinhotelapp.com/index.php");
		 driver.manage().window().maximize();

	}
	
	private static void Login() {
		
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Jivita04");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	
	private static void Hotel_Booking() {
		//Location
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select L1= new Select(location);
		L1.selectByVisibleText("New York");
		//Hotel name
		WebElement Hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select H= new Select(Hot);
		H.selectByVisibleText("Hotel Sunshine");
		//Room type
		WebElement Room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select R= new Select(Room);
		R.selectByVisibleText("Deluxe");
		//No of rooms
		WebElement NoOfRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select No= new Select(NoOfRoom);
		No.selectByVisibleText("1 - One");
		//Check in date
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("07/04/2024");
//		Select InDate= new Select(CheckInDate);
//		InDate.selectByVisibleText("Hotel Sunshine");
		
		//Check out date
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("09/04/2024");
		//No of Adult 
		WebElement Adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select A= new Select(Adult);
		A.selectByVisibleText("2 - Two");
		//No of Child
		WebElement Child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select NoOfChild= new Select(Child);
		NoOfChild.selectByVisibleText("0 - None");
		//Search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Logout 
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	

		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Launch();
		getUrl();
		Login();
		Hotel_Booking();
		
		
		
		
	}


	
	
	
	
}
