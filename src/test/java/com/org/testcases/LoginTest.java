package com.org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@Test
	public void doLogin() {

		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/span/span"))
				.click();
		System.out.println("Just login");
		/*
		 * Added new comments
		 */
		
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
