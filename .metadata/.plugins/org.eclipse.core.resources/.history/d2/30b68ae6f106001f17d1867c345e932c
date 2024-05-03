package com.adactin.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Adactin_runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public  WebDriver driver=Adactin_runner.driver;
	
	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() {
		
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter the Username in the Username Field$")
	public void user_Enter_the_Username_in_the_Username_Field() throws Throwable {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Jivita04");
	}

	@When("^user Enter the Password in the Password Field$")
	public void user_Enter_the_Password_in_the_Password_Field() throws Throwable {
		WebElement Pass_word = driver.findElement(By.id("password"));
		Pass_word.sendKeys("123456");
		
	}

	@Then("^user Clicks the Login Button And it Navigates to the Search Hotel Page$")
	public void user_Clicks_the_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("^user Select the Details of Location in the Location Field$")
	public void user_Select_the_Details_of_Location_in_the_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	
		Select s = new Select(location);
		s.selectByVisibleText("Sydney");
	}

	@When("^user Select the Hotel in the Hotels field$")
	public void user_Select_the_Hotel_in_the_Hotels_field() throws Throwable {
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Thread.sleep(2000);
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
	}

	@When("^user Select the Room Type in the Room Type Field$")
	public void user_Select_the_Room_Type_in_the_Room_Type_Field() throws Throwable {
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Thread.sleep(2000);
		Select s2 = new Select(roomtype);
		s2.selectByIndex(3);
	}
	
	@When("^user Select the Number(\\d+)fRooms in the Number Of Rooms Field$")
	public void user_Select_the_Number_fRooms_in_the_Number_Of_Rooms_Field(int arg1) throws Throwable {
		WebElement No_Rooms = driver.findElement(By.id("room_nos"));
		No_Rooms.click();
		Select rooms=new Select(No_Rooms);
		rooms.selectByIndex(4);
	}

	@When("^user Select the Check in Date in the Check in Date Field$")
	public void user_Select_the_Check_in_Date_in_the_Check_in_Date_Field() throws Throwable {
	WebElement CheckinDate = driver.findElement(By.id("datepick_in"));
	CheckinDate.sendKeys("17/04/2024");
	}

	@When("^user Select the Check Out Date in the Check Out Date Field$")
	public void user_Select_the_Check_Out_Date_in_the_Check_Out_Date_Field() throws Throwable {
	WebElement CheckoutDate = driver.findElement(By.id("datepick_out"));
	CheckoutDate.sendKeys("18/04/2024");
	}

	@When("^user Select the Adults per Room in the Adults per Room Field$")
	public void user_Select_the_Adults_per_Room_in_the_Adults_per_Room_Field() throws Throwable {
	WebElement Adult = driver.findElement(By.id("adult_room"));
	Adult.click();
	Select AdultRooms=new Select(Adult);
	AdultRooms.selectByIndex(2);
	}

	@When("^user Select the Children per Room in the Children per Room Field$")
	public void user_Select_the_Children_per_Room_in_the_Children_per_Room_Field() throws Throwable {
	WebElement ChildrenRoom = driver.findElement(By.id("child_room"));
	ChildrenRoom.click();
	Select ChildRoom=new Select(ChildrenRoom);
	ChildRoom.selectByIndex(1);
	}

	@Then("^user Clicks the Search Button And Navigates to the Select Hotel Page$")
	public void user_Clicks_the_Search_Button_And_Navigates_to_the_Select_Hotel_Page() throws Throwable {
	WebElement search_button = driver.findElement(By.id("Submit"));
	search_button.click();
	}

	@When("^user Select the Hotel Name in the Select field$")
	public void user_Select_the_Hotel_Name_in_the_Select_field() throws Throwable {
		WebElement select_hotel = driver.findElement(By.id("radiobutton_0"));
		select_hotel.click();
	}

	@Then("^user Clicks the Continue Button And it Navigates to the Book a Hotel Page$")
	public void user_Clicks_the_Continue_Button_And_it_Navigates_to_the_Book_a_Hotel_Page() throws Throwable {
	WebElement continue_button = driver.findElement(By.id("continue"));
	continue_button.click();
	}

	@When("^user Enter the First Name in the First name Field$")
	public void user_Enter_the_First_Name_in_the_First_name_Field() throws Throwable {
		WebElement First_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		First_name.sendKeys("Swathi");
		
	}

	@When("^user Enter the Last Name in the Last name Field$")
	public void user_Enter_the_Last_Name_in_the_Last_name_Field() throws Throwable {
		WebElement Last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		Last_name.sendKeys("K");

	}

	@When("^user Enter the Billing Address in the Billing Address Field$")
	public void user_Enter_the_Billing_Address_in_the_Billing_Address_Field() throws Throwable {
		WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
		Address.sendKeys("Anna Nagar");

	}

	@When("^user Enter the Credit Card No in the Credit Card details$")
	public void user_Enter_the_Credit_Card_No_in_the_Credit_Card_details() throws Throwable {
		WebElement CC_Num = driver.findElement(By.xpath("//input[@name='cc_num']"));
		CC_Num.sendKeys("1234567890123456");

	}
	
	@When("^user Select the Credit Card Type in the Credit Card Field$")
	public void user_Select_the_Credit_Card_Type_in_the_Credit_Card_Field() throws Throwable {
	WebElement CCType = driver.findElement(By.id("cc_type"));
	CCType.click();
	Select CC=new Select(CCType);
	CC.selectByIndex(1);
	}

	@When("^user Select the Expiry Date in the Select Month Field$")
	public void user_Select_the_Expiry_Date_in_the_Select_Month_Field() throws Throwable {
		WebElement expirydate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s5 = new Select(expirydate);
		s5.selectByVisibleText("February");
	}

	@When("^user Select the Expiry Date in the Select Year Field$")
	public void user_Select_the_Expiry_Date_in_the_Select_Year_Field() throws Throwable {
		WebElement expiryMonth = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s6 = new Select(expiryMonth);
		s6.selectByValue("2024");
	}

	@When("^user Enter the CVV Number in the CVV Field$")
	public void user_Enter_the_CVV_Number_in_the_CVV_Field() throws Throwable {
		WebElement cvv_no = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv_no.sendKeys("344");

	}

	@Then("^user Clicks the Book Now Button And it Navigates to the Booking Confirmation Page$")
	public void user_Clicks_the_Book_Now_Button_And_it_Navigates_to_the_Booking_Confirmation_Page() throws Throwable {
		WebElement Book_now = driver.findElement(By.xpath("//input[@name='book_now']"));
		Book_now.click();

	}

	@Then("^user Clicks the My Itinerary Button in the Booking confirmation page And it Navigates to the Booked Itinerary Page$")
	public void user_Clicks_the_My_Itinerary_Button_in_the_Booking_confirmation_page_And_it_Navigates_to_the_Booked_Itinerary_Page() throws Throwable {
		WebElement Itenary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		Itenary.click();

	}

	@When("^user Search there Order details in the Search Order Id Field$")
	public void user_Search_there_Order_details_in_the_Search_Order_Id_Field() throws Throwable {
	driver.findElement(By.id("order_id_text"));
	

	}

	@When("^user Enter the Order Id in the search order id field$")
	public void user_Enter_the_Order_Id_in_the_search_order_id_field() throws Throwable {
		WebElement Order_id = driver.findElement(By.id("order_id_text"));
		Order_id.sendKeys("P796Z88F9X");
	}

	@When("^Clicks the Go button$")
	public void clicks_the_Go_button() throws Throwable {
		WebElement Click_go = driver.findElement(By.id("search_hotel_id"));
		Click_go.click();
	}

	@When("^user should get the order details in the page$")
	public void user_should_get_the_order_details_in_the_page() throws Throwable {
		WebElement order_details = driver.findElement(By.name("cancelall"));
		order_details.click();
		
	}

	@Then("^user Clicks the Logout button And it Navigates to the Successfully Logged out page$")
	public void user_Clicks_the_Logout_button_And_it_Navigates_to_the_Successfully_Logged_out_page() throws Throwable {
		WebElement Logout = driver.findElement(By.xpath("//input[@name='logout']"));
		Logout.click();
		
	}



}
