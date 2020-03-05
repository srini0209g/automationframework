package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.PasswordchangePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PasswordChange {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private PasswordchangePOM PasswordchangePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		PasswordchangePOM = new PasswordchangePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();
	}
	@Test (enabled= true,priority=3)
	public void passwordchange() {
		
		PasswordchangePOM.sendUserName("Srini0209e");
		PasswordchangePOM.sendPassword("Srin@0213");
		PasswordchangePOM.clickLoginBtn();
		PasswordchangePOM.editProfile();
		PasswordchangePOM.passWord("Srin@0213");
		PasswordchangePOM.newpassWord("Srin@0214");
		PasswordchangePOM.conpassWord("Srin@0214");
		PasswordchangePOM.savesettings();
		}
}
