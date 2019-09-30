package automationpractice.com.GrazielleSilva;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CartTest {
	
	
	@Test (testName ="Sign Site")
	public void testSign() throws Exception {
		
		WebDriver webDriver = null;
		MutableCapabilities capabilities = null;
		System.setProperty("webdriver.chrome.driver", "/home/Downloads/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
		HashMap<String, String> chromePreferences = new HashMap<String, String>();
		chromePreferences.put("profile.password_manager_enabled", "false");
		options.setCapability("chrome.prefs", chromePreferences);
		options.addArguments("start-maximized");
		capabilities = options;

		webDriver = new ChromeDriver(options);
		
		webDriver.get("http://automationpractice.com/index.php");
		
		webDriver.findElement(By.linkText("Sign in")).click();
		webDriver.findElement(By.name("email")).sendKeys("qagrazielledasilva@gmail.com");
		webDriver.findElement(By.name("passwd")).sendKeys("G_ra17588");
		webDriver.findElement(By.name("SubmitLogin")).click();

		webDriver.get("http://automationpractice.com/index.php");
		
		webDriver.findElement(By.className("shopping_cart")).click();
		
		webDriver.get("http://automationpractice.com/index.php?controller=order");
		
	}

}