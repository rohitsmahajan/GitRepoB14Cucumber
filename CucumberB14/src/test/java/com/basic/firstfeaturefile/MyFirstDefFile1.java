package com.basic.firstfeaturefile;

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
	
//	@When("^User enters \"([^\"]*)\" First name$")
//	public void User_enters_First_name(String uName){
//		driver.findElement(By.name("firstname")).sendKeys(uName);
//		
//	}
	
//	@Then ("^user checks entered name \"([^\"]*)\" is present in first name$")
//			public void user_checks_entered_name_is_present_in_first_name(String s){
//		String actualusername = driver.findElement(By.name("firstname")).getAttribute("value");
//		
//		System.out.println(actualusername);
//		Assert.assertEquals("David", actualusername);
//	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" as First name and Last name$")
	public void User_enters_and_as_First_name_and_Last_name(String username,String lastname){

		driver.findElement(By.name("firstname")).sendKeys(username);
		driver.findElement(By.name("lastname")).sendKeys(lastname);


}
	@Then("^user checks entered names \"([^\"]*)\" and \"([^\"]*)\" are present in name fields$")
	public void user_checks_entered_names_and_are_present_in_name_fields(String uname,String lname){
		
		String actualusername = driver.findElement(By.name("firstname")).getAttribute("value");
		String actuallastname = driver.findElement(By.name("lastname")).getAttribute("value");
		
		System.out.println(actualusername+" "+actuallastname);
		
		Assert.assertEquals("Rohit", actualusername);
		Assert.assertEquals("Mahajan", actuallastname);
		
	}
}
