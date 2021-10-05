package com.Base_Class;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class Base_Class {
		
		public static WebDriver driver; //null driver

		public static WebDriver getBrowser(String type) {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.geckp.driver", System.getProperty("user.dir") + 
						"\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			} 
			
			return driver;
		}
		
		public static void getUrl(String url) {
			driver.get(url);
		}
		
		public static void wait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
		
		public static void sendkeys(WebElement ele, String val) {
			ele.sendKeys(val);
		}
		
		public static void click(WebElement ele) {
			ele.click();
		}
		
		public static void clear(WebElement ele) {
			ele.clear();
		}
		public static void select(WebElement ele, String type, String value) {
			
			Select s = new Select(ele);
			if (type.equalsIgnoreCase("index")) {
				int val = Integer.parseInt(value);
				s.selectByIndex(val);
			}else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}else if (type.equalsIgnoreCase("visible text")) {
				s.selectByVisibleText(value);
			}
			
		}
		
		public static void sleep(int sec) throws Throwable {
			Thread.sleep(sec);
		}
		
		public static void screenshort(String uri) throws Throwable {
			
			TakesScreenshot t = (TakesScreenshot)driver;
			File s = t.getScreenshotAs(OutputType.FILE);
			File d = new File(uri);
			FileUtils.copyFile(s, d);
		}
		
		public static void MoveAction(WebElement ele , String type) {
			Actions a = new Actions(driver);
			if (type.equalsIgnoreCase("moveToElementclick")) {
				a.moveToElement(ele);
				a.click().perform();
			}else if (type.equalsIgnoreCase("moveElement")) {
				a.moveToElement(ele).perform();
			}else if (type.equalsIgnoreCase("click")) {
				a.click(ele).perform();
			}
		
		}
		
		public static void close() {
			
			driver.close();
		}
}