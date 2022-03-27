package com.bcc.mavenBCC;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void TestCase1() throws InterruptedException {
	  System.out.println("This is my test area 1");
	  System.out.println("Title of the page: " + driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	  Thread.sleep(5000);
  }
  
  @Test
  public void TestCase2() {
	  Assert.assertEquals("HelloWorld", "HelloWorld");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my precondition area");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\usa71\\eclipseworkspace\\mavenBCC\\servers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.selenium.dev/"); 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my post conditions area");
	  driver.quit();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I need a valid application url");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close the application url");
  }
}
