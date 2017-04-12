package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Checklist extends Home {
	 @Test(priority=2)
	  public void ChecklistNavi() throws InterruptedException {
		  //click on Checklist
		  AppUrl.driver.findElement(By.xpath(".//*[@id='menu']/div[2]/img")).click();
		  Thread.sleep(1000);  
	  }
	 @Test(priority=3)
	  public void ChecklistAddNavi() throws InterruptedException {
		  //click on Add New tab
		  AppUrl.driver.findElement(By.xpath("html/body/section/div[1]/div[2]/div[1]/div[4]/label")).click();
		  Thread.sleep(1000);
		  }
	
	 @Test(priority=4)
	  public void ChecklistAdd() throws InterruptedException {
		 try{
		 ChecklistClient.ChkListClientCurrentDay();
		 ChecklistClient.ChkListClientFeatureItems();
		 ChecklistClientCaregiver.ChkListClientCurrentDay();
		 ChecklistClientCaregiver.ChkListClientFeatureItems();
		 ChecklistCaregiver.ChkListClientCurrentDay();
		 ChecklistCaregiver.ChkListClientFeatureItems();
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 
		 }
	 }
  
}
