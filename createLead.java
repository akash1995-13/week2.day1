package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("DemoSalesManager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Coreinc");
			
			  
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akash");
			
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Munna");
			
		    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aki");
			 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			 driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Tester");
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akashfret@gmail.com");
			 WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 
			 Select dd=new Select(source);
			    dd.selectByVisibleText("New York");
		    driver.findElement(By.name("submitButton")).click();
		     
		    String title = driver.getTitle();
		    System.out.println("Title of the page is : " + " " + title);
		 
		 }
	}

 
