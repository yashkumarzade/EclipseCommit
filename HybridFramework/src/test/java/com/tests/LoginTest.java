package com.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class LoginTest extends BaseClass {

	public static WebDriver driver;

	@BeforeSuite
	public void sutUp() {
		driver = initialization();
		reportIntialization();

	}
	@AfterSuite
	public void TearDown() {
		driver.close();
	}

	@Test
	public void loginTitle() {
		log.info("excecuting testcase loginTitle ");
		assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}

	@Test
	public void loginlogo() {
		log.info("excecuting testcase loginlogo ");
		WebElement logo = driver.findElement(By.tagName("img"));
		assertFalse(logo.isDisplayed());
	}

	@Test
	public void loginLable() {
		log.info("excecuting testcase loginLable ");
		throw new SkipException("skipping a testcase");
	}

}
