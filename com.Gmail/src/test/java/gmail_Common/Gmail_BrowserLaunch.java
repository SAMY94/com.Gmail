package gmail_Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Gmail_BrowserLaunch {
	public static WebDriver driver = new ChromeDriver();
	@BeforeTest
	public static void launchBrowser() {
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AS5LTAQA658uaGiBhQmsT5kyj23boaPk8rHdzAgBuljKI7uRHTqnFZMz6TExQcrlqODJ7b6xJZzF&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		System.out.println("Level-0-");
	}
}
