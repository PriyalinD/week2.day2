package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String arg[]) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://en-gb.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Lemuel");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Prem");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("priyalinlemy@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("priyalinlemy@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password_step_input")).sendKeys("BRilly95**");
	Thread.sleep(2000);
	WebElement date=driver.findElement(By.id("day"));
	Select dd=new Select(date);
	dd.selectByVisibleText("25");
	Thread.sleep(2000);
	
	WebElement mm=driver.findElement(By.id("month"));
	Select m1=new Select(mm);
	m1.selectByValue("3");
	Thread.sleep(2000);
	
	WebElement yr=driver.findElement(By.id("year"));
	Select y1=new Select(yr);
	y1.selectByIndex(27);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	Thread.sleep(2000);
	
	
}
}