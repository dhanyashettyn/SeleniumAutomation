package takingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String baseUrl =" http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	driver.get(baseUrl);
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test1");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(".\\screenshot\\login_error.png"));
	
	
			
	//Thread.sleep(2000);
	driver.close();
}

}

