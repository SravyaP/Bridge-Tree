package com.BridgeTree.TestNG;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Login {
	@Test(priority=1)
	  public void login() throws InterruptedException {
		  System.out.println("maximize");
		  AppUrl.driver.manage().window().maximize();	
			Thread.sleep(1000);
			System.out.println("navigate");
			AppUrl.driver.get(AppUrl.url);
			Thread.sleep(1000);
			AppUrl.driver.findElement(By.id("username")).sendKeys("admin");
			AppUrl.driver.findElement(By.id("pwd")).sendKeys("e@!nf0@4o");
			AppUrl.driver.findElement(By.id("loginButton")).click();
			System.out.println("Login sucessfully");
		}
 
}
