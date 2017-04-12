package com.Homecare;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckList {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "https://10.10.1.35:8443/homecare/admin/login/login.jsp";
	//static final Logger logger = LogManager.getLogger(SeleniumFirst.class.getName());

	public static void main(String[] args) throws InterruptedException 
    {
	//	System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
		CheckList oSeleniumFirst=new CheckList();
    	oSeleniumFirst.chklistClient();
    	oSeleniumFirst.chklistClientCgtodo();
    	oSeleniumFirst.chklistCaregiver();
    	oSeleniumFirst.chklistEdit();
    	oSeleniumFirst.chklistDelete();
    }
    public void chklistClient() throws InterruptedException
    {   	
      try
      {   	   
    	  driver.get(baseUrl);
          driver.findElement(By.id("username")).sendKeys("e2info");
          driver.findElement(By.id("pwd")).sendKeys("e@!nf0@4o");
          driver.findElement(By.id("loginButton")).click();
          driver.manage().window().maximize();   
        driver.findElement(By.xpath("html/body/div[2]/aside/section/ul/li/a")).click();             
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Application Admin']")));
        driver.findElement(By.partialLinkText("Application Admin")).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Checklist']")));
        driver.findElement(By.partialLinkText("Checklist")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='mainPage']")));      	   
        	   /*for(int i=0;i<3;i++)
               {*/   	        		 
        		//   new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Add Checklist item")));
        		   driver.findElement(By.partialLinkText("Add Checklist item")).click();
        		   Thread.sleep(2000);
        		   new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("checklistdescr")));
        		   driver.findElement(By.id("checklistdescr")).sendKeys("checklist from admin");
        		   Thread.sleep(2000);
        		   driver.findElement(By.id("datepicker")).click();
        		   Thread.sleep(2000);
        		   driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[4]/td[5]/a")).click();
        		   Thread.sleep(2000);    
        		   driver.findElement(By.xpath("html/body/div[3]/div/form/div[6]/select/option")).click();
        		   Thread.sleep(2000);
        		   driver.findElement(By.id("submitaddchecklist")).click();  
        		   Thread.sleep(5000);
        		   driver.findElement(By.id("addchecklistclose")).click();
        		
          // }
      	}
      catch(Exception e1)
      {
      System.out.println(e1);
      }
 
        Thread.sleep(5000);
    }
    public void chklistClientCgtodo() throws InterruptedException
    {
    	 try
         {
    		 driver.findElement(By.partialLinkText("Add Checklist item")).click();
    		 Thread.sleep(2000);
    		 new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("checklistdescr")));
    		 driver.findElement(By.id("checklistdescr")).sendKeys("checklist from admin");
    		 Thread.sleep(2000);
    		 driver.findElement(By.id("datepicker")).click();
    		 Thread.sleep(2000);
    		 driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[4]/td[5]/a")).click();
    		 Thread.sleep(2000);
    		 driver.findElement(By.id("cgtodo")).click();
  		   	 Thread.sleep(2000);
    		 driver.findElement(By.xpath("html/body/div[3]/div/form/div[6]/select/option")).click();
    		 Thread.sleep(2000);
    		 driver.findElement(By.id("submitaddchecklist")).click();  
    		 Thread.sleep(5000);
    		 driver.findElement(By.id("addchecklistclose")).click();
         }
    	 catch(Exception e1)
         {
         System.out.println(e1);
         }
    }
    public void chklistCaregiver() throws InterruptedException
    {
    	try
        {
    	 Thread.sleep(2000);
    	 driver.findElement(By.partialLinkText("Add Checklist item")).click();
		 Thread.sleep(2000);
   		 new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("checklistdescr")));
   		 driver.findElement(By.id("checklistdescr")).sendKeys("checklist from admin");
   		 Thread.sleep(2000);
   		 driver.findElement(By.id("datepicker")).click();
   		 Thread.sleep(2000);
   		 driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[4]/td[5]/a")).click();
   		 Thread.sleep(2000);
   		 driver.findElement(By.id("caregiver")).click();
		 Thread.sleep(2000);
   		 driver.findElement(By.xpath("html/body/div[3]/div/form/div[8]/select/option")).click();
   		 Thread.sleep(2000);
   		 driver.findElement(By.id("submitaddchecklist")).click();  
   		 Thread.sleep(5000);
   		 driver.findElement(By.id("addchecklistclose")).click();
        }
   	 catch(Exception e1)
        {
        System.out.println(e1);
        } 
    //	driver.close();
    //    System.exit(0);
    }
    public void chklistEdit() throws InterruptedException
    {
    	try
        {
    		Thread.sleep(2000);
    		driver.findElement(By.id("editval")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.id("updatechecklistdescr")).clear();
    		driver.findElement(By.id("updatechecklistdescr")).sendKeys("checklist from admin updated");
    		Thread.sleep(2000);
    		driver.findElement(By.id("submitupdate")).click();
    		driver.findElement(By.id("closeButton")).click();
    		
        }
    	catch(Exception e1)
        {
        System.out.println(e1);
        }
    }
    public void chklistDelete() throws InterruptedException
    {
    	try
        {
    		Thread.sleep(2000);
    		driver.findElement(By.id("deleteval")).click();
    		Thread.sleep(5000);
        }
    	catch(Exception e1)
        {
        System.out.println(e1);
        }
        driver.close();
        System.exit(0);
    }

}
