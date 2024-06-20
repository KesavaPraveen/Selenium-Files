package com.qa.seleniumbrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtilities {

	
	private WebDriver driver;
	
	public WebElement getElement(By locator)
	{
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public void doSelectByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectByVisibleText(By locator, String text)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
}
