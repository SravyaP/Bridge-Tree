package com.Homecare;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static WebDriver driver = new FirefoxDriver();
    
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

	public static void main(String[] args)throws InterruptedException {
		 login();

	}

	
	
	//  .//*[@id='hr_19_8']
}
