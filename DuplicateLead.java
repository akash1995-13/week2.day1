package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
  
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		//String driverpath = System.getProperty("Webdriver.chrome.driver");
		//System.out.println(driverpath);
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//login
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicking on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clicking on Leads
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Filling the fields using id locator
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CoreSolutionsInc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Munna");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aki");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manual Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akashfret@gmail.com");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tester");
		
		//selecting Dropdown options
		
	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByValue("LEAD_CONFERENCE");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stdd=new Select(state);
		stdd.selectByVisibleText("California");
		
		//Submit button
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

		//Duplicate lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		//Clearing the fields
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		
		//Clicking the CreateLead button
		
		driver.findElement(By.name("submitButton")).click();
		
		////webpage title
		System.out.println(driver.getTitle());
		
		//Closing the browser
		Thread.sleep(3000);
		driver.close();

}

	}

 
