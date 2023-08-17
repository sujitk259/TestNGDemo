package testScripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;

	@BeforeTest
	// @BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}

	@Test
	public void searchJavaTest() {

		driver.get("https://www.google.com/");
		// Assert.assertEquals(driver.getTitle(), "Google Search");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.getTitle(), "Java Tutorials - Google Search");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Java Tutorials");
		srchBox.sendKeys(Keys.ENTER);
		softassert.assertEquals(driver.getTitle(), "Javas Tutorials - Google Search");
		softassert.assertAll();
	}

	@Test
	public void searchSeleniumTest() {
		driver.get("https://www.google.com/");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Selenium Tutorials");
		srchBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorials - Google Search");
		driver.close();
	}

	@Test
	public void searchAppiumTest() {
		driver.get("https://www.google.com/");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Selenium Tutorials");
		srchBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorials - Google Search");
		driver.close();
	}

	@Test
	public void searchCucumberTest() {
		driver.get("https://www.google.com/");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Selenium Tutorials");
		srchBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorials - Google Search");
		driver.close();
	}

	@AfterTest
	// @AfterMethod
	public void tearDown() {
		driver.close();
	}
}
