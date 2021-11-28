package seleniumBootcamp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditSalesAccount extends Baselogin{

	@Test
	public void editAccnt() throws InterruptedException {
	
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		WebElement acc = driver.findElement(By.xpath("(//span[text()='Accounts'])/parent::a"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", acc);
		WebElement searchaccnt = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		searchaccnt.sendKeys("Vaishnavi"+ Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='Technology Partner']/parent::span")).click();
		driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[6]")).click();
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Healthcare']/parent::span")));
		driver.findElement(By.xpath("//label[text()='Billing Street']/following::div/textarea")).sendKeys("100 Greys Avenue");
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow'])[11]/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//label[text()='Billing Zip/Postal Code']/following::div/input)[1]")).sendKeys("600018");
		driver.findElement(By.xpath("(//label[text()='Billing State/Province']/following::div/input)[1]")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("(//label[text()='Billing Country']/following::div/input)[1]")).sendKeys("India");
		driver.findElement(By.xpath("(//label[text()='Shipping Street']/following::div/textarea)[1]")).sendKeys("100 Greys Avenue");
		driver.findElement(By.xpath("//label[text()='Shipping City']/following::div/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//label[text()='Shipping Zip/Postal Code']/following::div/input")).sendKeys("600018");
		driver.findElement(By.xpath("(//label[text()='Shipping State/Province']/following::div/input)[1]")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("(//label[text()='Shipping Country']/following::div/input)[1]")).sendKeys("India");
		driver.findElement(By.xpath("//label[text()='Phone']/following::div/input")).sendKeys("123456789");
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[7]/div")));
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[8]/div")));
		driver.findElement(By.xpath("(//span[text()='Silver'])/parent::span")).click();
		execute.executeScript("arguments[0].click();", driver.findElement(By.xpath("(((//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[10])/div)[1]")));
		driver.findElement(By.xpath("//span[text()='No']/parent::span")).click();
		driver.findElement(By.xpath("((//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[9]/div)[1]")).click();
		driver.findElement(By.xpath("((//span[text()='No'])/parent::span)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[@class='forceOutputPhone slds-truncate']")).getText();
		System.out.println("Phone Number is :"+text);
		driver.close();
} 
}
