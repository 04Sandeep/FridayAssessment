package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver
{
      static WebDriver driver;
     By viewalltabs = By.xpath("(//a[contains(text(),'View All')])[1]");
    public MouseOver(WebDriver driver)
    {
        this.driver=driver;
    }

    public  void mouseOver() throws InterruptedException
    {
        WebElement click = driver.findElement(By.xpath("(//a[contains(text(),'Women')])[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(click).perform();
        driver.findElement(viewalltabs).click();
    }
    public void verification()
    {
       WebElement verify = driver.findElement(By.xpath("//h1[@role='alert']"));
        String actual = verify.getText();
        String expected = "Women's New In";
        Assert.isTrue(actual.equals(expected), "Not as Expected");
    }
}
