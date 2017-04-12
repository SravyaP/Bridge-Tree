package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class ChecklistClientCaregiver {
	

	  public static void ClientCaregiver() throws InterruptedException {
		  //Click on Caregiver
		  AppUrl.driver.findElement(By.id("cgtodo")).click();
		  Thread.sleep(1000);  
	  }
	  @Test(priority=5)
	  public static void ChkListClientCurrentDay() throws InterruptedException {
		  ChecklistClient.ChkListClientDescr();
		  ClientCaregiver();
		  ChecklistClient.ChkListClient();
		ChecklistClient.date();
		ChecklistClient.ChkListClientSubmit();
		
	}
	@Test(priority=6)
	  public static void ChkListClientFeatureItems() throws InterruptedException {
		try{
			ChecklistClient.ChkListClientDescr();
			ClientCaregiver();
			ChecklistClient.ChkListClient();
		ChecklistClient.FutureDate();
		Thread.sleep(1000);
		ChecklistClient.ChkListClientSubmit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	  
}
