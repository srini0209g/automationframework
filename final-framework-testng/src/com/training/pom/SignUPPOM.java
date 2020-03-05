package com.training.pom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUPPOM {
    
    private WebDriver driver; 
    
    public SignUPPOM(WebDriver driver) {
        this.driver = driver; 
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText="Sign up!")
    private WebElement Signup;
    
    @FindBy(xpath="//div[contains(@class,'radio')][1]")
    private WebElement TeachCources;
    
    @FindBy(id = "registration_firstname")
    private WebElement FirstName;
    @FindBy(id = "registration_lastname")
    private WebElement LastName;
    
    @FindBy(id = "registration_email")
    private WebElement Email;
    
    @FindBy(id = "username")
    private WebElement Username;
    
    
    @FindBy(id = "pass1")
    private WebElement Password1;
    @FindBy(id = "pass2")
    private WebElement Password2;
    
    @FindBy(id = "registration_phone")
    private WebElement Phone;
    
    @FindBy(className = "caret")
    private WebElement Languagebutton; 
    
    
    //@FindBy(xpath="//span[contains(@class,'caret')]")
    //@FindBy(xpath="//div[contains(@class,'radio')][2]")
    
    @FindBy(className = "form-control")
    private WebElement Language;
//    Select Language = new Select(Language1);
//    Language.selectVisibleTest("Deutsch");
    
    
    @FindBy(name = "official_code")
    private WebElement Code;
    @FindBy(id = "extra_skype")
    private WebElement Skype;
    
    @FindBy(id = "extra_linkedin_url")
    private WebElement Linkedin;
    @FindBy(id = "registration_submit")
    private WebElement Register;
    
    public void signUp() {
    this.Signup.click(); 
    }
    public void teachCources() {
    this.TeachCources.click(); 
    }
    
    public void firstName() {
    this.FirstName.sendKeys("Srinivas"); 
    }
    public void lastName() {
    this.LastName.sendKeys("Geddada"); 
    }
    
    public void email() {
    this.Email.sendKeys("Srini0209g@gmail.com"); 
    }    
    
    public void userName() {
    this.Username.sendKeys("Srini0209e"); 
    }
    
    public void password() {
    this.Password1.sendKeys("Srin@0213"); 
    }
    
    public void cpassword() {
    this.Password2.sendKeys("Srin@0212"); 
    }
    
    public void phone() {
    this.Phone.sendKeys("8309000721"); 
    }
    
    public void languagebutton()
    {
        this.Languagebutton.click();
    }
    
    public void language() {
    this.Language.sendKeys("English");
    this.Language.sendKeys(Keys.ENTER);
    }
    
    public void code() {
    this.Code.sendKeys("001"); 
    }
    
    public void skype() {
    this.Skype.sendKeys("srinivas@skype"); 
    }
    public void linkedin() {
    this.Linkedin.sendKeys("srinivas@linkedin.com"); 
    }
    public void register() {
    this.Register.click(); 
    }    
    
}