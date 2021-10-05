package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooK_Hotel {
	
	public WebDriver driver;
	
	public BooK_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFName() {
		return FName;
	}

	public WebElement getLName() {
		return LName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpriMonth() {
		return ExpriMonth;
	}

	public WebElement getExpriYear() {
		return ExpriYear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement FName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement LName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement CardNumber;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement CardType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ExpriMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ExpriYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement CVVNumber;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement BookNow;
	
	
	
	
	
}
