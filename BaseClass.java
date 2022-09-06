package Test;

import Pages.PageFactory;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass
{

        protected static PageFactory pageFactory;
        static WebDriver driver;
        public static void admin()
        {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver.get("https://www.marksandspencer.in/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            pageFactory=new PageFactory(driver);
        }
        public static void close()
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.close();
        }
    }






