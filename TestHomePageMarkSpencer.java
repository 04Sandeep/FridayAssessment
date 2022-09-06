package Test;

import java.time.Duration;


public class TestHomePageMarkSpencer extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        admin();
        driver.manage().window().maximize();
        pageFactory.getMouseOver().mouseOver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        pageFactory.getMouseOver().verification();
        close();

       /*pageFactory.getSearch().search();
        pageFactory.getsignin().signin();*/


    }
}
