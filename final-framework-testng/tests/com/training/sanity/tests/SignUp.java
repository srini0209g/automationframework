package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
//import com.training.pom.PasswordresetPOM;
import com.training.pom.SignUPPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import org.testng.annotations.Test;
public class SignUp {
    private WebDriver driver;
    private String baseUrl;
    private LoginPOM loginPOM;
    //private PasswordresetPOM passwordresetPOM;
    private SignUPPOM signUpPOM;
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
        signUpPOM = new SignUPPOM(driver);
        baseUrl = properties.getProperty("baseURL");
        screenShot = new ScreenShot(driver); 
        // open the browser 
        driver.get(baseUrl);
    }
    
	@AfterMethod
	public void tearDown() throws Exception {
	Thread.sleep(5000);
	driver.quit();
	}
    @Test(enabled=true,priority=1)
    public void SignUp(){
    	signUpPOM.signUp();
    	signUpPOM.teachCources();
    	signUpPOM.firstName();
    	signUpPOM.lastName();
    	signUpPOM.email();
    	signUpPOM.userName();
    	signUpPOM.password();
    	signUpPOM.cpassword();
    	signUpPOM.phone();
    	signUpPOM.languagebutton();
    	signUpPOM.language();
    	signUpPOM.code();
    	signUpPOM.skype();
    	signUpPOM.linkedin();
    	signUpPOM.register();
            
    }
}
 