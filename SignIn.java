package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    WebDriver driver;
    By login = By.xpath("//span[@class='user-message']");
    public SignIn(WebDriver driver)
    {
    this.driver=driver;
    }
    public void signin()
    {
        driver.findElement(login).click();
    }
}