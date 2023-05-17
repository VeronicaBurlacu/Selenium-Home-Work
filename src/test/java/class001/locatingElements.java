package class001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        //intitate the instance
        WebDriver driver=new ChromeDriver();
        //facebook.com
        driver.get("https://www.facebook.com/");
        //to maximize the window
        driver.manage().window().maximize();
        //send some text in the email
        driver.findElement(By.id("email")).sendKeys("Veronica36890@gmail.com");
//send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("abracdarbra");
//print the url on console
         String url=driver.getCurrentUrl();
        System.out.println(url);
       // print the title on console
        String title= driver.getTitle();
        System.out.println(title);
        // confirm that the title is Facebook log in or log out
        if(title.equals("Facebook-log in or log out")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }
        driver.quit();
    }
}
