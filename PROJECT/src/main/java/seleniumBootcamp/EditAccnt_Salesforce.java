package seleniumBootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAccnt_Salesforce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://d2w00000dnnegeal-dev-ed.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("SelBootcamp$12345");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		WebElement acc = driver.findElement(By.xpath("(//span[text()='Accounts'])/parent::a"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", acc);
		WebElement searchaccnt = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		searchaccnt.sendKeys("Vaishnavi"+ Keys.ENTER);
		Thread.sleep(10000);
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Vaishnavi']")));
		Thread.sleep(6000);
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")));
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();

		 }

	

}
