package web_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InteractingWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

//       Respective website
        webDriver.get("https://parabank.parasoft.com/parabank/");

//        click() method -- click on that area
        webDriver.findElement(By.xpath("//input[@value = \"Log In\"]")).click();

//        getText() method -- getting text from the respective area
        System.out.println("Getting Text from About Us: " + webDriver.findElement(By.linkText("About Us")).getText());

//        sendKeys() method -- passing value in that respect area
        webDriver.findElement(By.name("username")).sendKeys("ABCXYZ");

//        clear() method -- clear value from input area
        webDriver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(3000);
        webDriver.findElement(By.name("password")).clear();

//        submit() method -- using to submit form data
        webDriver.findElement(By.xpath("//input[@type = \"submit\"]")).submit();


        Thread.sleep(4000);
        webDriver.quit();

    }
}
