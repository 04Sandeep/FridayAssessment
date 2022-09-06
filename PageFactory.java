package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private MouseOver mouseOver;
   /*private Search search;
    private SignIn signin;*/

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public MouseOver getMouseOver() {
        if (mouseOver == null) {
            mouseOver = new MouseOver(driver);
        }
        return mouseOver;

    }
}

  /*  public Search getSearch()
    {
        if (search == null)
        {
            search = new Search(driver);
        }
        return search;
    }
    public SignIn getsignin()
    {
        if (signin == null)
        {
            signin = new SignIn(driver);
        }
        return signin;
    }*/







