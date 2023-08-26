package week2.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {

	public static void main(String[] args) throws IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(co);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//To take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("snap1.png");
		FileUtils.copyFile(source, dest);


	}

}
