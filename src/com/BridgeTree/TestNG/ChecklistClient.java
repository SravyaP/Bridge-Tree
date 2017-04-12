package com.BridgeTree.TestNG;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BridgeTree.TestNG.Global.AppUrl;

public class ChecklistClient {

	
	  public static void ChkListClientDescr() throws InterruptedException {
	
		//Enter Checklist description
		AppUrl.driver.findElement(By.id("checklistdescr")).sendKeys("Checklist description coloumn1");
		  Thread.sleep(1000);
	  }
	  public static void ChkListClient() throws InterruptedException {
		  //Choose Client from the list
		  WebElement o_Item= AppUrl.driver.findElement(By.id("totalroomlist"));
			o_Item= AppUrl.driver.findElement(By.id("totalroomlist"));
			Thread.sleep(3000);
			o_Item.findElement(By.xpath("//option[contains(text(),'1111- ClientLast, ClientFirst')]")).click();
			Thread.sleep(1000);	
		}
	  public static void date() throws InterruptedException {
			//Select date
		  AppUrl.driver.findElement(By.id("datepicker")).click();
		  Thread.sleep(1000);
		  WebElement dateWidget = AppUrl.driver.findElement(By.id("ui-datepicker-div"));
			List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
			//Goto Current Date format
			 DateFormat dateFormat = new SimpleDateFormat("d");
			 
			 //get current date time with Date()
			 Date date = new Date();
			 
			 // Now format the date
			 String date1= dateFormat.format(date);
		
			 // Print the Date
			 System.out.println(date1);


			for (WebElement cell: columns){
			   //Select 13th Date 
			   if (cell.getText().equals(date1)){
			      cell.findElement(By.linkText(date1)).click();
			      break;
			   }
			}
		  
	  }
	  public static void FutureDate() throws InterruptedException {
		  try{
			//Select date
		  AppUrl.driver.findElement(By.id("datepicker")).click();
		  Thread.sleep(1000);		
			 for(int mon=1;mon<=3;mon++){	
					AppUrl.driver.findElement(By.partialLinkText("Next")).click();
				Thread.sleep(2000);
				
				}
			 WebElement dateWidget = AppUrl.driver.findElement(By.id("ui-datepicker-div"));  
			 List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
			for (WebElement cell: columns){
				Thread.sleep(2000);
			   //Select 13th Date 
			   if (cell.getText().equals("4")){
				   Thread.sleep(2000);
			      cell.findElement(By.linkText("4")).click();
			      Thread.sleep(2000);
			      break;
			   }
			}
	  }catch(Exception e){
			e.printStackTrace();
		}
			 
	  }
	  
	@Test(priority=5)
	  public static void ChkListClientCurrentDay() throws InterruptedException {
		ChkListClientDescr();
		ChkListClient();
		date();
		ChkListClientSubmit();
		
	}
	@Test(priority=6)
	  public static void ChkListClientFeatureItems() throws InterruptedException {
		try{
		ChkListClientDescr();	
		ChkListClient();
		FutureDate();
		Thread.sleep(1000);
	    ChkListClientSubmit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	  public static void ChkListClientSubmit() throws InterruptedException {
		
		//Click on Add Checklist item button
		AppUrl.driver.findElement(By.id("submitaddchecklist")).click();
		  Thread.sleep(1000);
	  }
	
}
