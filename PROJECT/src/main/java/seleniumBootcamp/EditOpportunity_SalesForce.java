package seleniumBootcamp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class EditOpportunity_SalesForce extends Baselogin {
	@Test
	public void editOpp() throws InterruptedException {
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
	driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']/parent::a"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", opp);
	WebElement searchbyname = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"));
	searchbyname.sendKeys("Vaishnavi" + Keys.ENTER);
	Thread.sleep(5000);
	executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1])/a")));
	executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("((//li[@class='uiMenuItem'])/a/div)[1]")));
	executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Select a date']/parent::button")));
	Thread.sleep(3000);
	executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[4]")));
	Thread.sleep(3000);
	executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Perception Analysis']/parent::span")));
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String text =driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();
	System.out.println("Stage is updated to :"+text);
	//close browser
	driver.close();
	}
}
