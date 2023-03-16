package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win109\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl= "file:///D:/HTMLCode/alert_demo.html";
		driver.get(baseUrl);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.id("cmdClick")).click();
		Thread.sleep(1000);
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
}
