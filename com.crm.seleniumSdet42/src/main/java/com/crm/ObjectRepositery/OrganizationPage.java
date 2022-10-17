package com.crm.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateorgBtn() {
		return createorgBtn;
	}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorgBtn;
	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement orgtextbtn;
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement bttn;
	
	public WebElement getOrgtextbtn() {
		return orgtextbtn;
	}
	
	public WebElement getBttn() {
		return bttn;
	}
	public void orgpage()
	{
		createorgBtn.click();
		}
	public void writenText(String dt)
	{
		orgtextbtn.sendKeys(dt);
		bttn.click();
		
	}
	
}
