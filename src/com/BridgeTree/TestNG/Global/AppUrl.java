package com.BridgeTree.TestNG.Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppUrl {
	  public static WebDriver driver = new FirefoxDriver();
		public static final String url = "https://10.10.1.35";
		
		@Test(priority=1)
	  public void f() {
			
			
	  }
}
