package org.TestNG_Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Helper.File_Reader_Manager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sdp.Page_Object_Manager;

public class TestNG_Runner extends Base_Class {
	
	public static WebDriver driver;

	public static Page_Object_Manager pom;
	
	ExtentTest test;
	
	ExtentReports report;
	
	ExtentSparkReporter reporter;
	
	@BeforeTest
	private void Configuration() {
		
		reporter = new ExtentSparkReporter(".//TestNG_Report//Extent.html");
		
		report = new ExtentReports();
		
		report.attachReporter(reporter);
		
	}
	
	@Test(priority = 0)
	private void home_page() throws Throwable {
		
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
		
		test = report.createTest("Sigin_Button");
	}

	@Test(priority = 1)
	private void search_hotel() throws Throwable {

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
		
		test = report.createTest("Search Hotel");
	}

	@Test(priority = 2)
	private void select_hotel() {

		click(pom.getInstanceSTH().getSelectHotel());
		click(pom.getInstanceSTH().getProceed());
		
		test = report.createTest("Select Hotel");
	}

	@Test(priority = 3)
	private void booK_hotel() throws Throwable {

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
		
		test = report.createTest("Book Hotel");
	}

	@Test(priority = 4)
	private void book_confirm() throws Throwable {

		click(pom.getInstanceBC().getItinerary());
		sleep(3000);

		click(pom.getInstanceBC().getLogout());
		
		test = report.createTest("Booking Confirmation and Logout");

	}
	
	@Test(priority = 5)
	private void Browser_Close() {
		
		driver.close();
	}

	@AfterTest
	private void write_test() {
		
		report.flush();
	}
}
