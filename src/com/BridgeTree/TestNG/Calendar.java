package com.BridgeTree.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class Calendar extends Home {
	 @Test(priority=2)
	  public void CalendarNavi() throws InterruptedException {
		  //click on Calendar
		  AppUrl.driver.findElement(By.xpath(".//*[@id='menu']/div[3]/img")).click();
		  Thread.sleep(1000);  
	  }
	 @Test(priority=3)
	  public void CalendarAdminNavi() throws InterruptedException {
		 //click on Lookup Client tab
		  AppUrl.driver.findElement(By.id("tab_2")).click();
		  Thread.sleep(1000); 
	 }
	// @Test(priority=4)
	  public void CalendarAdmin() throws InterruptedException {
		 //Click on Add Calendar button
		 AppUrl.driver.findElement(By.className("typeButton")).click();
		  Thread.sleep(1000); 
		  //Enter Calendar Name
		  AppUrl.driver.findElement(By.id("calendarName")).sendKeys("CalAdmin");
		  Thread.sleep(1000); 
		  //Click on Submit button
		  AppUrl.driver.findElement(By.id("popSubmit")).click();
		  Thread.sleep(1000);
	 }
	@Test(priority=5)
	  public void LookupNavi() throws InterruptedException {
		  //click on Lookup Client tab
		  AppUrl.driver.findElement(By.id("tab_4")).click();
		  Thread.sleep(1000);
		  }
	@Test(priority=6)
	  public void LookupCalSelect() throws InterruptedException {
			//Select Calendar name
			Select dropdown = new Select(AppUrl.driver.findElement(By.id("eventCal")));
    		Thread.sleep(1000);
    		dropdown.selectByVisibleText("CalAdmin");
			Thread.sleep(3000);	
		//Click on Submit button
			AppUrl.driver.findElement(By.xpath(".//*[@id='eventsDisplay']/table/tbody/tr[4]/td/input[1]")).click();
			  Thread.sleep(1000); 
	}
	 public void LookupEventAdd() throws InterruptedException {  
			//Click on New button
				AppUrl.driver.findElement(By.className("addEvent")).click();
				Thread.sleep(1000);
				//Enter Event name
				AppUrl.driver.findElement(By.id("event_name")).sendKeys("Event name");
				Thread.sleep(1000);
				//Enter Event description
				AppUrl.driver.findElement(By.id("event_description")).sendKeys("Event description");
				Thread.sleep(1000);
				//Select All the Event
				AppUrl.driver.findElement(By.id("alday")).click();
				  Thread.sleep(1000); 
			  
	}
	
	
	 public void LookupSubmit() throws InterruptedException {  
		 AppUrl.driver.findElement(By.xpath(".//*[@id='eventform']/div/table/tbody/tr[6]/td/table/tbody/tr/td[1]/input")).click();
		  Thread.sleep(1000); 
	 }
	 
	//@Test(priority=6)
	  public void LookupClientSelect() throws InterruptedException {
			//Select Calendar name
			Select dropdown = new Select(AppUrl.driver.findElement(By.id("client")));
  		Thread.sleep(1000);
  		dropdown.selectByVisibleText("1111-ClientLast, ClientFirst");
			Thread.sleep(3000);	
	}
	  @Test(priority=7)
	  public void LookupEvntClientAdd() throws InterruptedException {
		  LookupEventAdd();
		  LookupClientSelect();
		  LookupSubmit();	
	}
	  public void Recurrence() throws InterruptedException {
		  //Select Recurrence
		  AppUrl.driver.findElement(By.id("recurrentPattern")).click();
		  Thread.sleep(1000);   
	  }
	  @Test(priority=8)
	  public void LookupEvntCaregiverAdd() throws InterruptedException {
		  
		  
	  }

}
