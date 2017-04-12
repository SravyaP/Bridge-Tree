package com.Homecare;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIn {
		static WebDriver driver = new ChromeDriver();
	    
	    static Logger log = Logger.getLogger("Login");
	    public static void login() throws InterruptedException {
			
			System.out.println("maximize");
			driver.manage().window().maximize();	
			Thread.sleep(1000);
			System.out.println("navigate");
			driver.navigate().to("https://10.10.1.35:8443/homecare/admin/login/login.jsp");
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("pwd")).sendKeys("e@!nf0@4o");
			driver.findElement(By.id("loginButton")).click();
		}
	    public static void ApplicAdmin() throws InterruptedException {
	    	// to locate application administrator frame
	    	driver.switchTo().frame("mainPage");
			// to locate application administrator
					driver.findElement(By.xpath("html/body/div[2]/div/div/div[4]/div/a/img")).click();
					Thread.sleep(1000);
			      driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr[1]/td[6]/a")).click();
			      Thread.sleep(1000);
		}
	    public static void Checkin() throws InterruptedException {
	    	//Morning Start time Check-in
	    	driver.findElement(By.id("time_in1")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath(".//*[@id='hr_7_8']")).click();
	    	Thread.sleep(1000);
	   
	    	//Morning End time Check-in
	    	driver.findElement(By.id("time_out1")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath(".//*[@id='hr_10_11']")).click();
	    	Thread.sleep(1000);
	    	//Evening Start time Check-in
	    	driver.findElement(By.id("time_in2")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath(".//*[@id='hr_18_7']")).click();
	    	Thread.sleep(1000);
	    	
	    	//Evening End time Check-in
	    	driver.findElement(By.id("time_out2")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath(".//*[@id='hr_22_11']")).click();
	    	Thread.sleep(1000);	
	    	//Client name type
	    	WebElement se=driver.findElement(By.id("name_1"));
			Select dropdown = new Select(se);
		    dropdown.selectByVisibleText("Display client last name, first name");
			Thread.sleep(1000);
			 
			 //Morning message
			 driver.findElement(By.id("dmessage1")).clear();
			 Thread.sleep(1000);
			 driver.findElement(By.id("dmessage1")).sendKeys("<clientname>Good Morning! Please check-in with us");
			 Thread.sleep(1000);
			 
			//Evening message
			 driver.findElement(By.id("dmessage2")).clear();
			 Thread.sleep(1000);
			 driver.findElement(By.id("dmessage2")).sendKeys("<clientname>Good Evening! Please check-in with us");
			 Thread.sleep(1000);
			 
			 //Click on Submit button
			 driver.findElement(By.xpath(".//*[@id='formid']/div[2]/input")).click();
			 Thread.sleep(1000);
	    	
	    }
    public static void main(String args[])throws InterruptedException{
	login();
	 ApplicAdmin();
	 Checkin();
}

}
