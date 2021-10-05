package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotal {
	
	public WebDriver driver;
	
	public Select_Hotal(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectHotel;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement proceed;
	
	
	
	
	
	
	
	
	
	

}
