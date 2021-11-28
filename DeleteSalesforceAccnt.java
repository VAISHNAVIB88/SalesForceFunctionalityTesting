package seleniumBootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DeleteSalesforceAccnt extends Baselogin {

	@Test
	public void deleteAccnt() throws InterruptedException{
	
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();
		WebElement acc = driver.findElement(By.xpath("(//span[text()='Accounts'])/parent::a"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", acc);
		WebElement searchaccnt = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		searchaccnt.sendKeys("Vaishnavi"+ Keys.ENTER);
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Vaishnavi']")));
		Thread.sleep(6000);
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")));
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();

		 }

	

}
