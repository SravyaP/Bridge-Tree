package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Users {
  @Test(priority=1)
  public void User() throws InterruptedException {
	  //click on Users
	  AppUrl.driver.findElement(By.linkText("Users")).click();
	  Thread.sleep(1000);
	  
  }
  @Test(priority=2)
  public void UserAdd() throws InterruptedException {
	  try{
	  //click on Add New tab
	  AppUrl.driver.findElement(By.xpath(".//*[@id='menus']/div[2]/label")).click();
	  Thread.sleep(1000);
	  //Enter User Name
	  AppUrl.driver.findElement(By.id("userName")).sendKeys("Test User");
	  Thread.sleep(1000);
	//Enter first Name
	  AppUrl.driver.findElement(By.id("firstName")).sendKeys("first");
	  Thread.sleep(1000);
	//Enter Middle Name
	  AppUrl.driver.findElement(By.id("midName")).sendKeys("Middle");
	  Thread.sleep(1000);
	  
	//Enter Last Name
	  AppUrl.driver.findElement(By.id("lastName")).sendKeys("last");
	  Thread.sleep(1000);
	//Enter phone number
	  AppUrl.driver.findElement(By.id("phoneNo")).sendKeys("987-654-3210");
	  Thread.sleep(1000);
	//Enter Password
	  AppUrl.driver.findElement(By.id("password")).sendKeys("T123456");
	  Thread.sleep(1000);
	//Enter Confirm Password
	  AppUrl.driver.findElement(By.id("confirm_password")).sendKeys("T123456");
	  Thread.sleep(1000);
	  
	  //click on Change Password on First Login
	  AppUrl.driver.findElement(By.id("firstLoginFlag")).click();
	  Thread.sleep(1000);
	  //click on AddUsers button
	  AppUrl.driver.findElement(By.id("submit")).click();
	  Thread.sleep(1000);
	  }catch(Exception e){
		  e.printStackTrace();
		  
	  }
  }
  @Test(priority=3)
  public void UserAssignPriv() throws InterruptedException {
	//click on Assign Privileges tab
	  AppUrl.driver.findElement(By.xpath(".//*[@id='menus']/div[3]/label")).click();
	  Thread.sleep(1000);
	  //Select User Name from the drop down list
		Select dropdown = new Select(AppUrl.driver.findElement(By.id("userlist")));
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Test User");
		Thread.sleep(2500);
		//Click on Assign Privileges check box
		AppUrl.driver.findElement(By.id("assign")).click();
		  Thread.sleep(1000);
		  
		//Click on Submit button
			AppUrl.driver.findElement(By.xpath(".//*[@id='menu']/li[3]/button")).click();
			  Thread.sleep(1000);
  }
}
