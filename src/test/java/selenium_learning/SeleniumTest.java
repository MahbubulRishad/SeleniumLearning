package selenium_learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://parabank.parasoft.com/parabank/");
        webDriver.manage().window().maximize();

        Thread.sleep(4000);
        webDriver.quit();
    }
}
