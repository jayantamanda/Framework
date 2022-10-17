package com.crm.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="(//a[text()='Organizations'])")
	private WebElement orgBtn;
	
    @FindBy(xpath="(//a[.='Products'])")
    private WebElement prdBtn;
    
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
    private WebElement moreButton;
	
	@FindBy(xpath = "//a[@name='Campaigns']")
	private WebElement campaignButton;
	
    @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement LogoutBtn;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignBtn;
	
	
	public WebElement getMoreButton() {
		return moreButton;
	}

	public WebElement getCampaignButton() {
		return campaignButton;
	}

	public WebElement getPrdBtn() {
		return prdBtn;
	}
	
	public WebElement getmoreButton() {
		return moreButton;
	}
		
	public WebElement getSignBtn() {
		return SignBtn;
	}
	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	public WebElement getOrgBtn() {
		return orgBtn;
	}
	public void homepage()
	{
		 orgBtn.click();
		 prdBtn.click();
		 moreButton.click();
		 campaignButton.click();
		 LogoutBtn.click();
		 SignBtn.click();
	}
	

}
