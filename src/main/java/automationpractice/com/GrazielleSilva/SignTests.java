package automationpractice.com.GrazielleSilva;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTests {
	
	@Test (testName ="Sign Site")
	public void testSign() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/Downloads/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://automationpractice.com/index.php");
		
		webDriver.findElement(By.linkText("Sign in")).click();
		webDriver.findElement(By.name("email")).sendKeys("qagrazielledasilva@gmail.com");
		webDriver.findElement(By.name("passwd")).sendKeys("G_ra1758");
		webDriver.findElement(By.name("SubmitLogin")).click();
		
		webDriver.findElement(By.xpath("//*[contains(@id, 'center_column')]/div[1]/ol/li")).isDisplayed();
		
		webDriver.findElement(By.name("passwd")).sendKeys("G_ra17588");
		webDriver.findElement(By.name("SubmitLogin")).click();
		
		webDriver.quit();
		
	}
	
}