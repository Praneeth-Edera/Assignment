package com.example.demo.tdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.demo.pages.MyAccount;
import com.example.demo.pages.TestCases;

public class LoginUITest {
	WebDriver driver;
	MyAccount MyAccount;
	TestCases TestCases;

	@BeforeSuite
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Desktop/Virtual Training/jar_files/chromedriver.exe");
	}
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		MyAccount=new MyAccount(driver);
		TestCases=new TestCases(driver);
}
	@Test(priority=1)
	public void Myaccount() {
		MyAccount.account();
		MyAccount.SetUserName("praneeth.edera@gmail.com");
		MyAccount.SetPassword("Workfromhome$12");
		MyAccount.LoginBtnClick();
		MyAccount.Dashboard();
	}
	
	@Test(priority=2)
	public void testcases() {
  
		TestCases.open();
		TestCases.SelectTestCase();
	}

  }

