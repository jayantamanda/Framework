package com.crm.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerificationPage {
	public ValidationAndVerificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actualOrganizationData;
	public WebElement getActualOrganizationData() {
		return actualOrganizationData;
	}
	public void organizationValidation(WebDriver driver,String data)
	{
		String actData=actualOrganizationData.getText();
		if(actData.contains(data)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement actualProductData;
	public WebElement getActualProductData() {
		return actualProductData;
	}
	public void productValidation(WebDriver driver,String data)
	{
		String actData=actualProductData.getText();
		if(actData.contains(data)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actualCampaqignData;
	public WebElement getActualCampaqignData() {
		return actualCampaqignData;
	}
	public void campaignValidation(WebDriver driver,String data)
	{
		String actData=actualCampaqignData.getText();
		if(actData.contains(data)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
