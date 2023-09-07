package com.raghib.selenium.robotmouseandkeyboardevents;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=F7hUn0p2A0g&ab_channel=QAFox
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.raghib.selenium.BaseClass;

public class KeyPressAndKeyReleaseExample extends BaseClass {
	
	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	public static String url = "https://tutorialsninja.com/demo/";
	
	//ALL WEBELEMENT
	public static WebElement elementSearchBox;
	//public static WebElement elementFAQ; 
	
	//ALL LOCATORS
	public static By searchBoxXPath = By.xpath("//input[@name=\"search\"]");
	//public static By faqXPath = By.xpath("//a[@class='header-link' and text()='FAQ & support']");
	
	public static void main(String[] args) throws AWTException {
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
		
		elementSearchBox = driver.findElement(searchBoxXPath);
		elementSearchBox.sendKeys("HP");
		
		Robot robotObject = new Robot();
		robotObject.keyPress(KeyEvent.VK_ENTER);
		robotObject.keyRelease(KeyEvent.VK_ENTER);
		
		//BaseClass.quitDriver();
	}
}