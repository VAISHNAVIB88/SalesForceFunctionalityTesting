package seleniumBootcamp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class CreateAccnt_SalesForce extends Baselogin{
@Test
public void createAccnt() {
	//public static void main(String[] args) throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();
		WebElement acc = driver.findElement(By.xpath("(//span[text()='Accounts'])/parent::a"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", acc);
		driver.findElement(By.xpath("(//div[text()='New'])/parent::a")).click();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Vaishnavi");
	    driver.findElement(By.xpath("(//label[text()='Ownership']/following::input)[1]")).click();
	    driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[5]")).click();
	    driver.findElement(By.xpath("//span[text()='Public']")).click();
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
	}

}
