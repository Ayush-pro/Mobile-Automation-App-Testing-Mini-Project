package com.cyient.mobile.apptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZapyaFileTest {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		String value = "Ayush";
		cap.setCapability("deviceName", value);
		cap.setCapability("platformName	", "Android");
		cap.setCapability("app",
				"C:\\Users\\Ayush\\eclipse-workspace\\MobileApplicationTesting\\src\\test\\resources\\APK Files Resource\\Zapya File Transfer Share Apps Music Playlist_v5.10.6 (US)_apkpure.com.apk");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Upload\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Recieve\")").click();
		driver.findElementByAndroidUIAutomator(" UiSelector().description(\"Enter the content-description here\")");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'uploadSuccessContent')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Files\")").click();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Upload')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Recieve\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'maxlength=6')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
	}
}
	
