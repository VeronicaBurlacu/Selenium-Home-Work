package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
       fill out the form
      close the browser
      Note.use name or id as locators*/
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
   driver.manage().window().minimize();
   driver.findElement(By.id("customer.firstName")).sendKeys("Veronica");
   driver.findElement(By.id("customer.lastName")).sendKeys("Burlacu");
   driver.findElement(By.id("customer.address.street")).sendKeys("1673 North Emerald Bay");
   driver.findElement(By.id("customer.address.city")).sendKeys("Palatine");
   driver.findElement(By.id("customer.address.state")).sendKeys("Illinois");
   driver.findElement(By.id("customer.address.zipCode")).sendKeys("60090");
   driver.findElement(By.id("customer.phoneNumber")).sendKeys("550-456-890");
   driver.findElement(By.id("customer.ssn")).sendKeys("234-5667-890");
   driver.findElement(By.id("customer.username")).sendKeys("Verony");
   driver.findElement(By.id("customer.password")).sendKeys("abracdabra");
   driver.findElement(By.id("repeatedPassword")).sendKeys("abracadabra");
     Thread.sleep(5000);
        driver.quit();

    }
}
