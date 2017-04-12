package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Caregiver extends Manage {
	 @Test(priority=2)
	  public void CaregiverNavi() throws InterruptedException {
		  //click on Caregiver
		  AppUrl.driver.findElement(By.linkText("Caregiver")).click();
		  Thread.sleep(1000);
	 }
	 @Test(priority=3)
	  public void CaregiverAddNavi() throws InterruptedException {
		  //click on Add New tab
		  AppUrl.driver.findElement(By.id("tab_2")).click();
		  Thread.sleep(1000);
		  }
	 //@Test(priority=4)
	  public void CaregiverAdd() throws InterruptedException {
		 //Select Title
		 Select dropdown = new Select(AppUrl.driver.findElement(By.id("nameSalutation")));
			Thread.sleep(1000);
			dropdown.selectByVisibleText("Mr");
			Thread.sleep(2500);
			//Enter Check-In code
			 AppUrl.driver.findElement(By.id("staffCode")).sendKeys("1234");
			  Thread.sleep(1000);
		//Enter first Name
		  AppUrl.driver.findElement(By.id("staffName")).sendKeys("CaregiverFirst");
		  Thread.sleep(1000);
		//Enter Last Name
		  AppUrl.driver.findElement(By.id("lastName")).sendKeys("CaregiverLast");
		  Thread.sleep(1000);
		  //Enter Email
		  AppUrl.driver.findElement(By.id("emailAddress")).sendKeys("caregiver.email@gmail.com");
		  Thread.sleep(1000);
		  
		//Enter Primary number
		  AppUrl.driver.findElement(By.id("contactNo")).sendKeys("987-654-3210");
		  Thread.sleep(1000);
		//Enter Secondary number
		  AppUrl.driver.findElement(By.id("mobNo")).sendKeys("123-456-7890");
		  Thread.sleep(1000);
		  //Click on Add Client button
		  AppUrl.driver.findElement(By.id("addButton")).click();
		  Thread.sleep(1000); 
	 }
 
}
