package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {

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
		//Finally, we need to check if we are in correct page
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		//Get the attribute and print
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout")) {
			System.out.println("Successfully Logged In");
		}

		


	}

}
