package cookie_waits_actionAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

//        implicit waits -- Will check the all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        syntax of explicit wait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement userName = driver.findElement(By.id("userName"));
        explicitWait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys("Rishad");

        driver.quit();
    }
}
