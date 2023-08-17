package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleOneTest {
	@Test
	public void searchCypressTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Cypress Tutorials");
		srchBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Cypress Tutorials - Google Search");
		driver.close();
	}
}
//TestSuite->Test->Test Classes->Test Methods