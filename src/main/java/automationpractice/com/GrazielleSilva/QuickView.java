package automationpractice.com.GrazielleSilva;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;

public class QuickView {
	
	
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
		
		Actions action = new Actions(webDriver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		Actions builder = new Actions(webDriver);
		WebElement hoverElement;
		builder.moveToElement(hoverElement).perform();
		By locator = (By.xpath("//*[contains(@id, 'homefeatured')]/li[2]/div/div[1]/div/a[2]"));
		webDriver.click(locator);

		webDriver.findElement(By.xpath("//*[contains(@id, 'homefeatured')]/li[2]/div/div[1]/div/a[2]")).click();
		
	}

}