package com.qa.seleniumbrushup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtilities {

	private WebDriver driver;
	
	/*
	 * This Method initiates and return the driver and launch the Web Browser 
	 */
	public WebDriver launcBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	
	/*
	 * This method gets the Web URL
	 */
	public WebDriver getWebUrl(String url)
	{
		driver.get(url);;
		return driver;
	}
	
	/*
	 * This method return the title of the Page
	 */
	public String getpageTitle()
	{
		
		return driver.getTitle();
	}
	
	/*
	 * This methods return the Current URL of the WebPage
	 */
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	/*
	 * This method returns the Page Source of the WebPage
	 */
	public String getSourcePage()
	{
		return driver.getPageSource();
	}
	
	/*
	 * This method quits the WebBrowser
	 */
	public void quitBrowser()
	{
		driver.quit();;
	}
	
	/*
	 * This method closes the current WebBrowser Window
	 */
	public void closeBrowser()
	{
		driver.close();
	}
}
