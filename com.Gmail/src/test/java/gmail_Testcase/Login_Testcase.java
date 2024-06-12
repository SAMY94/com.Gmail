package gmail_Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import gmail_Common.Gmail_BrowserLaunch;
import gmail_Objects.Login_Objects;

public class Login_Testcase extends Gmail_BrowserLaunch{
	@Test
	public static void login() {
		System.out.println("Level-1");
		PageFactory.initElements(driver,Login_Objects.class);
		System.out.println("Level-2");
		Login_Objects.emailOrPhonenumber.sendKeys("k.samy94.km@gmail.com");
		System.out.println("Level-3");
		Login_Objects.nextButton.click();
	}
}
