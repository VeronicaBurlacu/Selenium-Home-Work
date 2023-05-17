package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        /*HW2:
navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"

*/
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(5000);
        String title=driver.getTitle();
        if(title.equals("Web Orders Login")){
            System.out.println("Title of webpage:"+title);
        }else{
            System.out.println("Incorrect title");
        }




    }
}
