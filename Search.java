package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver driver;

    By searchbutton = By.xpath("//input[@class = 'form-control search-field']");
    public Search(WebDriver driver)
    {
        this.driver=driver;
    }
   public void search()
   {
       driver.findElement(searchbutton).click();
   }
}
