package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class ChecklistCaregiver {

	  public static void ChckListSelectCaregiver() throws InterruptedException {
		  //Click on Caregiver
		  AppUrl.driver.findElement(By.id("caregiver")).click();
		  Thread.sleep(1000);  
	  }
	 public static void ChkListCaregiver() throws InterruptedException {
		  //Choose Client from the list
		  WebElement o_Item= AppUrl.driver.findElement(By.id("caregiveractivelist"));
			o_Item= AppUrl.driver.findElement(By.id("caregiveractivelist"));
			Thread.sleep(3000);
			o_Item.findElement(By.xpath("//option[contains(text(),'CaregiverLast, CaregiverFirst')]")).click();
			Thread.sleep(1000);	
		}
	 
	 @Test(priority=5)
	  public static void ChkListClientCurrentDay() throws InterruptedException {
		  ChecklistClient.ChkListClientDescr();
		  ChckListSelectCaregiver();
		  ChkListCaregiver();
		  ChecklistClient.date();
		  ChecklistClient.ChkListClientSubmit();
		
	}
	@Test(priority=6)
	  public static void ChkListClientFeatureItems() throws InterruptedException {
		try{
			ChecklistClient.ChkListClientDescr();
			ChckListSelectCaregiver();
			ChkListCaregiver();
			ChecklistClient.FutureDate();
			Thread.sleep(1000);
			ChecklistClient.ChkListClientSubmit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
