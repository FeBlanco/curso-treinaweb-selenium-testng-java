package br.com.treinaweb.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest extends TreinaWebSeleniumTestBase {
	
	@Test
	public void testUpload() {
		setUrl("http://demo.guru99.com/selenium/upload/");
		getDriver().findElement(By.id("uploadfile_0")).sendKeys("/Users/felpb/Downloads/wGfW75h8-5-casos-de-teste-e-suite-de-teste/teste-selenium.html");
		getDriver().findElement(By.id("terms")).click();
		getDriver().findElement(By.className("send")).click();
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("res")));
		
		Assert.assertTrue(getDriver().findElement(By.id("res")).isDisplayed());
		Assert.assertTrue(getDriver().findElement(By.id("res")).getText().contains("successfully"));
				
	}

}
