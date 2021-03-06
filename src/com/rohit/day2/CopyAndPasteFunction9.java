package com.rohit.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CopyAndPasteFunction9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set proxy
				String PROXY = "172.29.24.8:8080";
				org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
				proxy.setHttpProxy(PROXY)
				     .setFtpProxy(PROXY)
				     .setSslProxy(PROXY);
				System.setProperty("webdriver.firefox.marionette", "C:/geckodriverWin64/geckodriver.exe");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(CapabilityType.PROXY, proxy);
				
				
				// launching browser
				
				WebDriver driver = new FirefoxDriver(cap);
				
				// Maximise browser
				
				driver.manage().window().maximize();
				
				//  time out
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);		
				
				
				// enter url
				driver.get("https://www.google.com/advanced_search");
				
				//Enter data into 1st text box
				
				driver.findElement(By.id("_dKg")).sendKeys("Rohit");
				
				// Copy Data
				
				driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
				
				driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"c");
				
				driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
				driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
				driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
				driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
				
				

	}

}
