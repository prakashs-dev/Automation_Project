package org.Step_Definition;

import org.Test_Runner.Test_Run;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def extends Base_Class {
	
	public static WebDriver driver = Test_Run.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public static void BeforeHooks(Scenario s) throws Throwable {
		
		System.out.println("Befor Hooks");
		
		String status = s.getStatus();
		
		System.out.println("Status :"+status);
		
		if (s.isFailed()) {
			
			screenshort("E:\\Eclipse\\Selenium-Java\\Adactin_Project\\Picutres\\pic1.png");
		}
	}
	
	@Before
	public static void AfterHooks(Scenario s) throws Throwable {
		
		System.out.println("After Hooks");
		
		String status = s.getStatus();
		
		System.out.println("Status :"+status);
		
		if (s.isFailed()) {
			
			screenshort("E:\\Eclipse\\Selenium-Java\\Adactin_Project\\Picutres\\pic2.png");
		}
	}
	
	@Given("^user Lanuch The Applications$")
	public void user_Lanuch_The_Applications() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
		wait(10);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		
//		String user = File_Reader_Manager.getInstance().getInstanceCR().getUser();
		sendkeys(pom.getInstanceHP().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		
//		String pass = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		sendkeys(pom.getInstanceHP().getPassword(), password);
	}

	@Then("^user Click The Login Button And It Navigate To The Select Hotel Page$")
	public void use_Click_The_Login_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		
		click(pom.getInstanceHP().getLogin_Button());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		
		String location = File_Reader_Manager.getInstance().getInstanceCR().getlocation();
		select(pom.getInstanceSHH().getLocation(),"index",location);
	}

	@When("^user Select \"([^\"]*)\"$")
	public void user_Select_(String hotel) throws Throwable {
		
//		String hotel = File_Reader_Manager.getInstance().getInstanceCR().gethotels();
		select(pom.getInstanceSHH().getHotels(), "value", hotel);
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		
		String roomType = File_Reader_Manager.getInstance().getInstanceCR().getRoomType();
		select(pom.getInstanceSHH().getRoomType(), "visible text", roomType);

	}

	@When("^user Select Number of Numbers$")
	public void user_Select_Number_of_Numbers() throws Throwable {
		
		String roomsNo = File_Reader_Manager.getInstance().getInstanceCR().getRoomsNo();
		select(pom.getInstanceSHH().getNoRooms(), "index", roomsNo);
	}

	@When("^user Enter The Check IN Date$")
	public void user_Enter_The_Check_IN_Date() throws Throwable {
		
		String checkIN = File_Reader_Manager.getInstance().getInstanceCR().getcheckIN();
		clear(pom.getInstanceSHH().getCheckIN());
		sendkeys(pom.getInstanceSHH().getCheckIN(), checkIN);
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		
		String checkOUT = File_Reader_Manager.getInstance().getInstanceCR().getcheckOUT();
		clear(pom.getInstanceSHH().getCheckOUT());
		sendkeys(pom.getInstanceSHH().getCheckOUT(), checkOUT);
	}
	
	@When("^user Select Adult Room$")
	public void user_Select_Adult_Room() throws Throwable {
		
		String adultRoom = File_Reader_Manager.getInstance().getInstanceCR().getAdultRoom();
		select(pom.getInstanceSHH().getARoom(), "index", adultRoom);
	}

	@When("^User Select Child Room$")
	public void user_Select_Child_Room() throws Throwable {
		
		String childRoom = File_Reader_Manager.getInstance().getInstanceCR().getChildRoom();
		select(pom.getInstanceSHH().getCRoom(), "visible", childRoom);
	}

	@Then("^user Click Search a Hotel And Navigate To Select Hotel Page$")
	public void user_Click_Search_a_Hotel_And_Navigate_To_Select_Hotel_Page() throws Throwable {
		
		click(pom.getInstanceSHH().getSearch());
		sleep(3000);
	}

	@When("^user Click On The Radio Button Select Hotel On Given A List$")
	public void user_Click_On_The_Radio_Button_Select_Hotel_On_Given_A_List() throws Throwable {
		
		click(pom.getInstanceSTH().getSelectHotel());
	}

	@Then("^user Click A Continue Button And Navigate To Book Hotel Page$")
	public void user_Click_A_Continue_Button_And_Navigate_To_Book_Hotel_Page() throws Throwable {
		
		click(pom.getInstanceSTH().getProceed());
	}

	@When("^user Enter A First Name On The Fname Field$")
	public void user_Enter_A_First_Name_On_The_Fname_Field() throws Throwable {
		
		String fname = File_Reader_Manager.getInstance().getInstanceCR().getFname();
		sendkeys(pom.getInstanceBH().getFName(), fname);
	}

	@When("^user Enter A Last Name On The Lname Field$")
	public void user_Enter_A_Last_Name_On_The_Lname_Field() throws Throwable {
		
		String lname = File_Reader_Manager.getInstance().getInstanceCR().getLname();
		sendkeys(pom.getInstanceBH().getLName(), lname);
	}

	@When("^user Enter A Address On The Billing Address Field$")
	public void user_Enter_A_Address_On_The_Billing_Address_Field() throws Throwable {
		
		String address = File_Reader_Manager.getInstance().getInstanceCR().getaddress();
		sendkeys(pom.getInstanceBH().getAddress(), address);
	}

	@When("^user Enter A Card Number In Credit Card No Field$")
	public void user_Enter_A_Card_Number_In_Credit_Card_No_Field() throws Throwable {
		
		String CardNumber = File_Reader_Manager.getInstance().getInstanceCR().getCardNumber();
		sendkeys(pom.getInstanceBH().getCardNumber(), CardNumber);
	}

	@When("^user Select A Card Type In Card Type Field$")
	public void user_Select_A_Card_Type_In_Card_Type_Field() throws Throwable {
		
		String CardType = File_Reader_Manager.getInstance().getInstanceCR().getCardType();
		sendkeys(pom.getInstanceBH().getCardType(), CardType);
	}

	@When("^user Select A Exprie Month In Exp Month Field$")
	public void user_Select_A_Exprie_Month_In_Exp_Month_Field() throws Throwable {
		
		String ExpMonth = File_Reader_Manager.getInstance().getInstanceCR().getExpMonth();
		select(pom.getInstanceBH().getExpriMonth(), "value", ExpMonth);
	}

	@When("^user Select A Exprie Year In Exp Year Field$")
	public void user_Select_A_Exprie_Year_In_Exp_Year_Field() throws Throwable {
		
		String ExpYear = File_Reader_Manager.getInstance().getInstanceCR().getExpYear();
		sendkeys(pom.getInstanceBH().getExpriYear(), ExpYear);
	}

	@When("^user Enter A CVV No In CVV Field$")
	public void user_Enter_A_CVV_No_In_CVV_Field() throws Throwable {
		
		String CVVNo = File_Reader_Manager.getInstance().getInstanceCR().getCVVNo();
		sendkeys(pom.getInstanceBH().getCVVNumber(), CVVNo);
		sleep(3000);
	}

	@Then("^user Click A BooK Now Button And Its Navigate To Booking Confirmation Page$")
	public void user_Click_A_BooK_Now_Button_And_Its_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	
		click(pom.getInstanceBH().getBookNow());
		wait(20);
	}

	@When("^user Click The My Itinerary Button And Navigate To Booked Itinerary Page$")
	public void user_Click_The_My_Itinerary_Button_And_Navigate_To_Booked_Itinerary_Page() throws Throwable {
	
		click(pom.getInstanceBC().getItinerary());
		sleep(3000);
	}

	@When("^user Click The Logut Button$")
	public void user_Click_The_Logut_Button() throws Throwable {
		
		click(pom.getInstanceBC().getLogout());
	}


}
