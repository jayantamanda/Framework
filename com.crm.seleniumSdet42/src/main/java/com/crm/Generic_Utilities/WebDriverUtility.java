package com.crm.Generic_Utilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * Wait for page to load before identifying any synchronized in DOM
	 * @param driver
	 */
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
public void WaitForElementToBeClickable(WebDriver driver,WebElement Element)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(Element));
}

/**
 * Used to switch to any Window based on window title,
 * @author Jayanta
 */
public void switchToWindow(WebDriver driver,String PartialWindowTitle)
{
	Set<String> allId=driver.getWindowHandles();
	java.util.Iterator<String> it =allId.iterator();
	while(it.hasNext())
	{
		String wid=it.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains(PartialWindowTitle))
		{
			break;
		}
	}
	
}
 /*
  * Used to switch to alert window and accept
  */
public void switchToAllertAndAccept(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
/*
 * used to switch to alert window and dismiss
 */
public void switchToAllertAndDismiss(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
/*
 * used to switch to frame window based on index
 */
public void switchToFrame(WebDriver driver,String id_name_Attribute)
{
	driver.switchTo().frame(id_name_Attribute);
}
/*
 * used to select the value from the dropdown based on index
 */
public void select(WebElement element,int index)
{
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
/*
 * used to select the value from the dropdown based on text
 */
public void select(WebElement element,String text)
{
	Select sel=new Select(element);
			sel.selectByVisibleText(text);
}
/*
 * used to place mouse cursor on specified element
 */
public void mouseOverOnElement(WebDriver driver,WebElement element)
{
	Actions act =new Actions(driver);
	act.moveToElement(element).perform();
}
/*
 * used to right click on specific element
 */
public void rightcliclOnElement(WebDriver driver,WebElement element)
{
	Actions act =new Actions(driver);
	act.contextClick(element).perform();
	
}
public void moveByOffset(WebDriver driver,int x,int y)
{
	Actions act =new Actions(driver);
	act.moveByOffset(x, y).click().perform();
}
}
