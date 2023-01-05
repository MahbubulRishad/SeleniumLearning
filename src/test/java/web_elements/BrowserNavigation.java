package web_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        webDriver.get("https://demoqa.com/text-box");

//        Navigation
        webDriver.navigate().to("https://demoqa.com/checkbox");
        Thread.sleep(2000);

//        back to previous link
        webDriver.navigate().back();
        Thread.sleep(2000);

//        forward the link
        webDriver.navigate().forward();
        Thread.sleep(2000);

//        refresh the web page
        webDriver.navigate().refresh();
        Thread.sleep(2000);

        webDriver.quit();
    }
}
