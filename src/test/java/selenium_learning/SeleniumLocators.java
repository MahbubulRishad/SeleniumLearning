package selenium_learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumLocators {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

//        Window maximization
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

//        Get Link
        webDriver.get("https://parabank.parasoft.com/parabank/");

//        send values in username input box (Locator: name)
        webDriver.findElement(By.name("username")).sendKeys("ABCXYZ");

//        send values in password input box (Locator: xpath)
        webDriver.findElement(By.xpath("//input[@name = \"password\"]")).sendKeys("123456");

//        link test on Register link (Locator: LinkText)
        webDriver.findElement(By.linkText("Register")).click();

//        Sending value in first name (Locator: css locator)
        webDriver.findElement(By.cssSelector("#customer\\.firstName")).sendKeys("Rishad");

//        sending value in Last name (Locator: id)
        webDriver.findElement(By.id("customer.lastName")).sendKeys("Mahbubul");

    }
}
