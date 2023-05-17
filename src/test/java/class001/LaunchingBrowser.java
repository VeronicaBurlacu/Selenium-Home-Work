package class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        //use.get(url)=>to navigate to the desired url
        driver.get("http://www.google.com");
        //maximazi the window
        driver.manage().window().maximize();
        String currentUrl= driver.getCurrentUrl();
        System.out.println("teh current url of the website is:"+currentUrl);

        //to get the title of the page
      String title=  driver.getTitle();
        System.out.println("the title of the page is:" +title);
        //add some wait time
        Thread.sleep(5000);
        //close the webrowser
        driver.quit();





    }
}
