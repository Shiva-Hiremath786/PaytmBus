package Paytm.Bus;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition;

public class Busbooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tickets.paytm.com/bus/");
	//	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		 
		//Source
		driver.findElement(By.xpath("//div[@class='row bottom-xs _1CqX']//div[2]//div[1]//span[1]//div[1]//input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='VwI5']//div[4]//div[1]//p[1]")).click();
  
		//Destination
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[normalize-space()='Hyderabad'])[1]")).click();
		Thread.sleep(1000);
		
		//Date
		
		driver.findElement(By.xpath("//div[@class='fl-input-container _9KqY']//img[@role='presentation']")).click();
		js.executeScript("window.scroll(0,220)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[5]/div[6]")).click();
		
		//Search
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[8]/div/a/button")).click();
		Thread.sleep(6000);
		
		//Cheapest
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[4]/div/span[1]")).click();//
		js.executeScript("window.scroll(0,525)");
		Thread.sleep(3000);
		
		//select seats button
		driver.findElement(By.xpath("(//button[contains(text(),'Select Seats')])[12]")).click();
		Thread.sleep(2000);
		//Pick seat
		driver.findElement(By.xpath("(//div[@class='TyTb'])[2]")).click();
		Thread.sleep(2000);
		
		//PickUp point dropdown
		driver.findElement(By.xpath("//span[normalize-space()='Boarding Point']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@value='2'])[1]")).click();
     	Thread.sleep(1000);
		
		//Drop point
		driver.findElement(By.xpath("(//div[@class='rms-text rms-text__empty'])[1]")).click();
		driver.findElement(By.xpath("(//li[@value='2'])[1]")).click();
		Thread.sleep(1000);
		
		//continue
		driver.findElement(By.xpath("(//button[@class='button button--default button--block button--bold'])[1]")).click();
		Thread.sleep(5000);
		
		//Login
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/span/div/div/div[2]/span/a")).click();
	    Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		
		//Traveller Info
		
	//	WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='_1fRb'])[1]")));
		js.executeScript("window.scroll(0,450)");
		//Gender
		driver.findElement(By.xpath("(//div[@class='_1fRb'])[1]")).click();
	//	ele.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='col-xs-3 travellerformField']//input[@type='text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"text-box\"]")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='row u8Fs']//div[1]//div[1]//input[1]")).sendKeys("shiva@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='_6stC button button--block button--default'])[1]")).click();
		Thread.sleep(6000);
		
		driver.quit();
		
		
		
		
		
	}

}
