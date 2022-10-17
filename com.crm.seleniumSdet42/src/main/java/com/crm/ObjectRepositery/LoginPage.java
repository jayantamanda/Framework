package com.crm.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Declaration
	@FindBy(name="user_name")
	private WebElement usernameTxtBox;
	@FindBy(name="user_password")
	private WebElement pwdTxtBox;
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	public WebElement getUsernameTxtBox() {
		return usernameTxtBox;
	}
	public WebElement getPwdTxtBox() {
		return pwdTxtBox;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void login(String un,String pwd)
	{
		usernameTxtBox.sendKeys(un);
		pwdTxtBox.sendKeys(pwd);
		submitBtn.click();
	}

}
