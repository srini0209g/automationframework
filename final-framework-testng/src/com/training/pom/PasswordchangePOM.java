package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordchangePOM {

	private WebDriver driver; 
	
	public PasswordchangePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText = "Edit profile")
	private WebElement editProfile;
	
	@FindBy(id="profile_password0")
	private WebElement pass; 
	
	@FindBy(id="password1")
	private WebElement newPassword;
	
	@FindBy(id="profile_password2")
	private WebElement confirmPassword;
	
	@FindBy(id="profile_apply_change")
	private WebElement saveSettings;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void editProfile() {
		this.editProfile.click();
	}
	public void passWord(String password) {
	this.pass.clear(); 
	this.pass.sendKeys(password); 
	}		
	
	public void newpassWord(String password1) {
	this.newPassword.clear(); 
	this.newPassword.sendKeys(password1); 
	}		
		
	public void conpassWord(String password1) {
	this.confirmPassword.clear(); 
	this.confirmPassword.sendKeys(password1); 
	}		
	
	public void savesettings() {
		this.saveSettings.click();
	}
	
	}




