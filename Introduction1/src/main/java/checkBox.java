import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        //Create driver object
        //WebDriverManager object automatically download chrome exe and connects to browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.co.uk");
        Thread.sleep(7000);
        WebElement acceptcookie=driver.findElement(By.xpath("//*[@id=\'sp-cc-accept\']"));
        acceptcookie.click();
        //Gets the title of current page
        System.out.println(driver.getTitle());


        WebElement searchtxt =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchtxt.sendKeys("phones");
        //searchtxt.click();


        WebElement searchbtn =driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
        searchbtn.click();
        Thread.sleep(7000);
        WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"p_89/CUBOT\"]/span/a/span"));
        Thread.sleep(5000);
        checkbox.click() ;


        //acceptall.click();
        //unm.click();
        //act.moveToElement(unm).sendKeys("urvashi.punjabi@gmail.com").build().perform();
        //passwd.click();
        //act.moveToElement(passwd).sendKeys("test").build().perform();*/

    }
}
