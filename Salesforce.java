package seleniumBootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://d2w00000dnnegeal-dev-ed.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("SelBootcamp$1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		Thread.sleep(5000);
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']/parent::a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", opp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
		String text = "Salesforce Automation by Vaishnavi";
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]")).sendKeys(text);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-day'])[14]")).click();
		driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[3]")).click();
		Thread.sleep(5000);
		WebElement stage = driver.findElement(By.xpath("(//span[text()='Needs Analysis'])/ancestor::lightning-base-combobox-item"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", stage);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String text2 = driver.findElement(By.xpath(" //lightning-formatted-text[text()='Salesforce Automation by Vaishnavi']")).getText();
		System.out.println("Opportunities Text:" + text2);
		Assert.assertEquals(text2, text);
		driver.close();

	}
}
