package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Confirm {
	
	public WebDriver driver;
	
	public Book_Confirm(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getItinerary() {
		return Itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement Itinerary;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;
	
}
