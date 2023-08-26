package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(co);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//Find the username and enter username value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the password field and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Lead tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Click on company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capegemini");
		//Click on first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
		//Click on last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khanna");
		//Enter first name(loacal)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BK");
		//Enter department field
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		//Enter description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hard worker");
		//Enter mail
		driver.findElement(By.name("primaryEmail")).sendKeys("bks4u@gmail.com");
		//Dropdown
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("New York");
		//Click on create lead
		driver.findElement(By.name("submitButton")).click();
		//To get title
		System.out.println(driver.getTitle());
		
		

		


	}

}
