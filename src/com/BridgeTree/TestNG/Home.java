package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Home {
	 @Test(priority=1)
	  public void HomeNavi() throws InterruptedException {
		  //click on Home
		  AppUrl.driver.findElement(By.linkText("Home")).click();
		  Thread.sleep(1000);
		  
	  }
}
