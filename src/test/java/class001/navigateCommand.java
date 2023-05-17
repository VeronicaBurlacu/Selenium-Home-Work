package class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //create instance
        WebDriver driver=new ChromeDriver();
        //got to Google .com
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        //refresh the page
        driver.navigate().refresh();
        //slow down for 1 sec
        Thread.sleep(1000);
        //go to previous page
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        //close browser
        driver.quit();
        //close the current tab
        driver.close();
    }
}
