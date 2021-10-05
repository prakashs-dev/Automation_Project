package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File(".\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	public String getBrowser() {
	 
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		 
		String url = p.getProperty("getUrl");
		return url;
	}
	
	public String getUser() {
		 
		String user = p.getProperty("getUser");
		return user;
	}
	
	public String getPassword() {
		 
		String password = p.getProperty("getPassword");
		return password;
	}
	
	public String getlocation() {
		 
		String location = p.getProperty("location");
		return location;
	}
	
	public String gethotels() {
		 
		String hotel = p.getProperty("hotels");
		return hotel;
	}
	
	public String getRoomType() {
		 
		String roomType = p.getProperty("RoomType");
		return roomType;
	}
	
	public String getRoomsNo() {
		 
		String roomNo = p.getProperty("RoomsNo");
		return roomNo;
	}
	
	public String getcheckIN() {
		 
		String checkIN = p.getProperty("checkIN");
		return checkIN;
	}
	
	public String getcheckOUT() {
		 
		String checkOUT = p.getProperty("checkOUT");
		return checkOUT;
	}
	
	public String getAdultRoom() {
		 
		String AdultRoom = p.getProperty("AdultRoom");
		return AdultRoom;
	}
	
	public String getChildRoom() {
		 
		String ChildRoom = p.getProperty("ChildRoom");
		return ChildRoom;
	}
	
	public String getFname() {
		 
		String Fname = p.getProperty("Fname");
		return Fname;
	}
	
	public String getLname() {
		 
		String Lname = p.getProperty("Lname");
		return Lname;
	}
	
	public String getaddress() {
		 
		String address = p.getProperty("address");
		return address;
	}
	
	public String getCardNumber() {
		 
		String CardNumber = p.getProperty("CardNumber");
		return CardNumber;
	}
	
	public String getCardType() {
		 
		String CardType = p.getProperty("CardType");
		return CardType;
	}
	
	public String getExpMonth() {
		 
		String ExpMonth = p.getProperty("ExpMonth");
		return ExpMonth;
	}
	
	public String getExpYear() {
		 
		String ExpYear = p.getProperty("ExpYear");
		return ExpYear;
	}
	
	
	public String getCVVNo() {
		 
		String CVVNo = p.getProperty("CVVNo");
		return CVVNo;
	}
	
	
	
	

}
