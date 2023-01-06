package web_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectFromDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        webDriver.get("https://demo.guru99.com/test/newtours/register.php");

//        Select object
        Select select = new Select(webDriver.findElement(By.xpath("//select[@name = \"country\"]")));

//        Selecting web element from drop down by using SelectByIndex() method
        select.selectByIndex(5);
        Thread.sleep(2000);

//        Selecting web element from drop down by using SelectByValue() method
        select.selectByValue("BANGLADESH");
        Thread.sleep(2000);

//        Selecting web element from drop down by using SelectByVisibleText() method
        select.selectByVisibleText("CAMEROON");
        Thread.sleep(2000);

//        Getting all the elements from drop down
        for (WebElement all_elements: select.getOptions()){
            System.out.println("Elements from the Drop-down: " +all_elements.getText());
        }

        webDriver.quit();
    }
}
