package com.crm.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign {
	
	public Campaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[.='Campaigns'])[1]")
	private WebElement createCampBtn;
	public WebElement getCreateCampBtn() {
		return createCampBtn;
		
	}
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement CreatCampBtn;
	
	
		public WebElement getCreatCampBtn() {
			return CreatCampBtn;
		}
	
	public void createCampBtn()
	{
		createCampBtn.click();
		CreatCampBtn.click();
	}
	
	
	@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]")
	private WebElement CampaignTxtBox;
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveBtn;
	public WebElement getCampaignTxtBox() {
		return CampaignTxtBox;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void campaigntext(String dta)
	{
		CampaignTxtBox.sendKeys(dta);
		saveBtn.click();
		
}
}