package br.com.treinaweb.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TreinaWebSeleniumTestBase {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void setUrl(String url) {
		this.driver.get(url);
	}
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:/selenium/geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void afterTests() {
		if (this.driver != null) {
			this.driver.close();
			
		}
	}
	
	
	
}
