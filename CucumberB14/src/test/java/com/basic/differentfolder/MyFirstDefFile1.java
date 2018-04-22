package com.basic.differentfolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstDefFile1 {

	WebDriver driver;
	
	@Given ("^User needs to be on facebook login page$")
	public void User_needs_to_be_on_facebook_login_page(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\ChromeDriver\\Updated driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters \"([^\"]*)\" First name$")
	public void User_enters_First_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
		
	}
	
	@Then ("^user checks entered name \"([^\"]*)\" is present in first name$")
			public void user_checks_entered_name_is_present_in_first_name(String s){
		String actualusername = driver.findElement(By.name("firstname")).getAttribute("value");
		
		System.out.println(actualusername);
		Assert.assertEquals("David", actualusername);
		

	}
}
