package cookie_waits_actionAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/menu");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        creating object for mouse actions perform
        Actions actions = new Actions(driver);

        WebElement menuItem2 = driver.findElement(By.xpath("//a[normalize-space() = \"Main Item 2\"]"));

//        holding the element
        actions.clickAndHold(menuItem2).perform();
        Thread.sleep(3000);

//        right-clicking
//        actions.contextClick(menuItem2).perform();
//        Thread.sleep(3000);

//        Navigating different sub-menus
        actions.click(menuItem2).perform();
        Thread.sleep(3000);

//        Navigating sub menu
        WebElement subMenu = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        actions.moveToElement(subMenu).perform();
        Thread.sleep(3000);

//        Navigating sub-sub menu
        WebElement subSubMenu = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        actions.doubleClick(subSubMenu).perform();
        Thread.sleep(3000);


        driver.quit();
    }
}
