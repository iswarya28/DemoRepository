package com.action.keyboard.test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionTest {
	
	public void test() {
		System.out.println("checking test");
	}

	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\Browse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		WebDriverWait wait = new WebDriverWait(driver, 6);
		
		wait.until(ExpectedConditions.titleContains("Demo Form"));
		  
		WebElement tutorialElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Tutorial')]")));
		    
		Actions action = new Actions(driver);
		action.moveToElement(tutorialElement).build().perform();
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Web Automation Tools')]"))).build().perform();
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Cucumber')]"))).click().build().perform();
		  
		 // driver.close();  
		 }
		}
