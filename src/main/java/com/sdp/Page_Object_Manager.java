package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BooK_Hotel;
import com.pom.Book_Confirm;
import com.pom.Home_Page;
import com.pom.Search_Hotal;
import com.pom.Select_Hotal;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Home_Page hp;
	private Search_Hotal SearcHH;
	private Select_Hotal SHotel;
	private BooK_Hotel BH;
	private Book_Confirm BC;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
		
	}

	public Home_Page getInstanceHP() {
	hp = new Home_Page(driver);
	return hp;
	}
	
	public Search_Hotal getInstanceSHH() {
	SearcHH = new Search_Hotal(driver);
	return SearcHH;
	}
	
	public Select_Hotal getInstanceSTH() {
	SHotel = new Select_Hotal(driver);
	return SHotel;
	}
	
	public BooK_Hotel getInstanceBH() {
	BH = new BooK_Hotel(driver);
	return BH;
	}
	
	public Book_Confirm getInstanceBC() {
	BC = new Book_Confirm(driver);
	return BC;
	}
	
	
	
	
	
	
	
	
}
