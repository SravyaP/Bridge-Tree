package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class ClientDevice extends Manage {
	 @Test(priority=2)
	  public void ClientDeviceNavi() throws InterruptedException {
		  //click on Client/Device
		  AppUrl.driver.findElement(By.linkText("Client/Device")).click();
		  Thread.sleep(1000);  
	  }
	 @Test(priority=3)
	  public void ClientAddNavi() throws InterruptedException {
		  //click on Add New tab
		  AppUrl.driver.findElement(By.id("tab_2")).click();
		  Thread.sleep(1000);
		  }
	@Test(priority=4)
	  public void ClientAdd() throws InterruptedException {
		 //Select Title
		 Select dropdown = new Select(AppUrl.driver.findElement(By.id("title")));
			Thread.sleep(1000);
			dropdown.selectByVisibleText("Mr");
			Thread.sleep(2500);
		//Enter first Name
		  AppUrl.driver.findElement(By.id("firstName")).sendKeys("ClientFirst");
		  Thread.sleep(1000);
		//Enter Last Name
		  AppUrl.driver.findElement(By.id("lastName")).sendKeys("ClientLast");
		  Thread.sleep(1000);
		  //Enter Street Address1
		  AppUrl.driver.findElement(By.id("address1")).sendKeys("Address 1");
		  Thread.sleep(1000);
		//Enter Street Address2
		  AppUrl.driver.findElement(By.id("address2")).sendKeys("Address 2");
		  Thread.sleep(1000);
		//Enter City
		  AppUrl.driver.findElement(By.id("city")).sendKeys("Chennai");
		  Thread.sleep(1000);
		//Enter State
		  AppUrl.driver.findElement(By.id("state")).sendKeys("Tamilnadu");
		  Thread.sleep(1000);
		//Enter Zip code
		  AppUrl.driver.findElement(By.id("zipcode")).sendKeys("60090");
		  Thread.sleep(1000);
		//Enter Primary number
		  AppUrl.driver.findElement(By.id("primphone")).sendKeys("987-654-3210");
		  Thread.sleep(1000);
		//Enter Secondary number
		  AppUrl.driver.findElement(By.id("secphone")).sendKeys("123-456-7890");
		  Thread.sleep(1000);
		  //Click on Add Client button
		  AppUrl.driver.findElement(By.xpath(".//*[@id='clientInfoForm']/li[11]/input")).click();
		  Thread.sleep(1000);  
		  
	 }
	 @Test(priority=5)
	  public void ManageDeviceNavi() throws InterruptedException {
		//click on ManageDevice
		  AppUrl.driver.findElement(By.id("tab_3")).click();
		  Thread.sleep(1000); 
	 }
	 @Test(priority=6)
	  public void AddDevice() throws InterruptedException {
		//click on ManageDevice->AddNewDevice
		  AppUrl.driver.findElement(By.xpath("html/body/section/div/div[2]/div[2]/div/div[2]/div[3]/label")).click();
		  Thread.sleep(1000); 
		 //Enter Device number
		  AppUrl.driver.findElement(By.id("deviceNumber")).sendKeys("131");
		  Thread.sleep(1000); 
		  //Click on Add button
		  AppUrl.driver.findElement(By.xpath(".//*[@id='addDeviceForm']/li[2]/button")).click();
		  Thread.sleep(1000); 
	 }
	 @Test(priority=7)
	  public void AttachDevice() throws InterruptedException {
		 try{
		 //Attach device to client
		 AppUrl.driver.findElement(By.xpath("html/body/section/div/div[2]/div[2]/div/div[2]/div[2]/label")).click();
		  Thread.sleep(1000);
		 //Click on Attach button
		 AppUrl.driver.findElement(By.className("fa fa-link fg-lg")).click();
		  Thread.sleep(1000); 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	 }
	 
}
