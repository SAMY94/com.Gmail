package gmail_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Objects {
	@FindBy(xpath = "//*[@id=\"identifierId\"]")
	public static WebElement emailOrPhonenumber;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
	public static WebElement nextButton;
}
