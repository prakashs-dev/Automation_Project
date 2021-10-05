package org.Adactin_Hotal;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Adactin_Main extends Base_Class {

	public static WebDriver driver;

	public static Page_Object_Manager pom;

	public static void main(String[] args) throws Throwable {

		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = getBrowser(browser);
		pom = new Page_Object_Manager(driver);

		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
		wait(10);

		String user = File_Reader_Manager.getInstance().getInstanceCR().getUser();
		sendkeys(pom.getInstanceHP().getUsername(), user);

		String pass = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		sendkeys(pom.getInstanceHP().getPassword(), pass);

		click(pom.getInstanceHP().getLogin_Button());

		String location = File_Reader_Manager.getInstance().getInstanceCR().getlocation();
		select(pom.getInstanceSHH().getLocation(), "index", location);

		String hotel = File_Reader_Manager.getInstance().getInstanceCR().gethotels();
		select(pom.getInstanceSHH().getHotels(), "value", hotel);

		String roomType = File_Reader_Manager.getInstance().getInstanceCR().getRoomType();
		select(pom.getInstanceSHH().getRoomType(), "visible text", roomType);

		String roomsNo = File_Reader_Manager.getInstance().getInstanceCR().getRoomsNo();
		select(pom.getInstanceSHH().getNoRooms(), "index", roomsNo);

		String checkIN = File_Reader_Manager.getInstance().getInstanceCR().getcheckIN();
		clear(pom.getInstanceSHH().getCheckIN());
		sendkeys(pom.getInstanceSHH().getCheckIN(), checkIN);

		String checkOUT = File_Reader_Manager.getInstance().getInstanceCR().getcheckOUT();
		clear(pom.getInstanceSHH().getCheckOUT());
		sendkeys(pom.getInstanceSHH().getCheckOUT(), checkOUT);

		String adultRoom = File_Reader_Manager.getInstance().getInstanceCR().getAdultRoom();
		select(pom.getInstanceSHH().getARoom(), "index", adultRoom);

		String childRoom = File_Reader_Manager.getInstance().getInstanceCR().getChildRoom();
		select(pom.getInstanceSHH().getCRoom(), "visible", childRoom);

		click(pom.getInstanceSHH().getSearch());
		sleep(3000);

		click(pom.getInstanceSTH().getSelectHotel());
		click(pom.getInstanceSTH().getProceed());

		String fname = File_Reader_Manager.getInstance().getInstanceCR().getFname();
		sendkeys(pom.getInstanceBH().getFName(), fname);

		String lname = File_Reader_Manager.getInstance().getInstanceCR().getLname();
		sendkeys(pom.getInstanceBH().getLName(), lname);

		String address = File_Reader_Manager.getInstance().getInstanceCR().getaddress();
		sendkeys(pom.getInstanceBH().getAddress(), address);

		String CardNumber = File_Reader_Manager.getInstance().getInstanceCR().getCardNumber();
		sendkeys(pom.getInstanceBH().getCardNumber(), CardNumber);

		String CardType = File_Reader_Manager.getInstance().getInstanceCR().getCardType();
		sendkeys(pom.getInstanceBH().getCardType(), CardType);

		String ExpMonth = File_Reader_Manager.getInstance().getInstanceCR().getExpMonth();
		select(pom.getInstanceBH().getExpriMonth(), "value", ExpMonth);

		String ExpYear = File_Reader_Manager.getInstance().getInstanceCR().getExpYear();
		sendkeys(pom.getInstanceBH().getExpriYear(), ExpYear);

		String CVVNo = File_Reader_Manager.getInstance().getInstanceCR().getCVVNo();
		sendkeys(pom.getInstanceBH().getCVVNumber(), CVVNo);
		sleep(3000);

		click(pom.getInstanceBH().getBookNow());
		wait(20);

		click(pom.getInstanceBC().getItinerary());
//		screenshort("E:\\Eclipse\\Selenium-Java\\Adactin_Project\\Picutres\\pic1.png");
		sleep(3000);

		click(pom.getInstanceBC().getLogout());
		
		close();

	}

}
