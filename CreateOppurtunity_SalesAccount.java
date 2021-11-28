package seleniumBootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOppurtunity_SalesAccount extends Baselogin {

	@Test
	public void createOpp() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']/parent::a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", opp);
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
		String text = "Vaishnavi";
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]")).sendKeys(text);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-day'])[14]")).click();
		driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[3]")).click();
		WebElement stage = driver.findElement(By.xpath("(//span[text()='Needs Analysis'])/ancestor::lightning-base-combobox-item"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", stage);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String text2 = driver.findElement(By.xpath(" //lightning-formatted-text[text()='Vaishnavi']")).getText();
		System.out.println("Opportunities Text:" + text2);
		Assert.assertEquals(text2, text);
		driver.close();
	}
}
