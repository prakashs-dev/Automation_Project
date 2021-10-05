package org.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\org\\Adactin_Features\\Adactin.feature",	//---->path of feature file
		
		glue ="org.Step_Definition", //---> path of step definition
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true, 
		
		tags = ("~@regressiontest"),
		
		plugin = { "html:Report/Cucumber-Report",
				
					"pretty",
					
					"json:Report/JsonReport.json",
					
//					"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
				}
		
		)
public class Test_Run {
	
	public static WebDriver driver;  //-----> Null Browser
	
	@BeforeClass
	public static void set_up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		driver = Base_Class.getBrowser(browser);
	}
	
	@AfterClass
	public static void tear_down() {
		
		driver.close();
	}
	
	

}
