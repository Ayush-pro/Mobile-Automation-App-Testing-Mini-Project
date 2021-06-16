package com.cyient.mobile.apptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ShazamTest {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		String value = "Samsung";
		cap.setCapability("deviceName", value);
		cap.setCapability("platformName	", "Android");
		cap.setCapability("app",
				"C:\\Users\\Ayush\\eclipse-workspace\\MobileApplicationTesting\\src\\test\\resources\\APK Files Resource\\com.shazam.android_2021-06-14.apk");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Play Music\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Genre\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'India Top 200')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"India Top 200\")").click();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Top')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Top\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'India')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
	
		
	}



}


