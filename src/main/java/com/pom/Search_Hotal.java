package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotal {
	
	public WebDriver driver;
	
	public Search_Hotal(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoRooms() {
		return NoRooms;
	}

	public WebElement getCheckIN() {
		return checkIN;
	}

	public WebElement getCheckOUT() {
		return checkOUT;
	}

	public WebElement getARoom() {
		return ARoom;
	}

	public WebElement getCRoom() {
		return CRoom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement RoomType;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement NoRooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkIN;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOUT;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement ARoom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement CRoom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;
	
	
	
}
