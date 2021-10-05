package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	public Home_Page(WebDriver driver2){
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login_Button;

	public WebElement getLogin_Button() {
		return login_Button;
	}
	
	
	
	
}
