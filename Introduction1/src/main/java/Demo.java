import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        //Create driver object
        //WebDriverManager object automatically download chrome exe and connects to browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
       // driver.manage().deleteAllCookies();
        //delete all cookies
        //Thread.sleep(7000);
        driver.get("http://www.facebook.com");
        Thread.sleep(7000);

        //Gets the title of current page
        System.out.println(driver.getTitle());
       ;

        Actions act = new Actions(driver);

        WebElement unm =driver.findElement(By.xpath("//*[@id='email']"));
        WebElement passwd =driver.findElement(By.id("pass"));
        WebElement loginBtn =driver.findElement(By.name("login"));
        WebElement acceptall =driver.findElement(By.xpath("//*[@id='u_0_h']"));

        acceptall.click();
        unm.click();
        act.moveToElement(unm).sendKeys("urvashi.punjabi@gmail.com").build().perform();
        passwd.click();
        act.moveToElement(passwd).sendKeys("test").build().perform();
        
    }
}
