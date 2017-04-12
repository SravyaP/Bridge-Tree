package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Manage {
	 @Test(priority=1)
	  public void ManageNavi() throws InterruptedException {
		  //click on Manage
		  AppUrl.driver.findElement(By.linkText("Manage")).click();
		  Thread.sleep(1000);
		  
	  }
}
