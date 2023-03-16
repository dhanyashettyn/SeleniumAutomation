package dayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrySelenium
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String baseUrl=" http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	driver.get(baseUrl);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
}
}