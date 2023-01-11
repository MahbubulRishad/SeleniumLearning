package cookie_waits_actionAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/droppable");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        Creating Actions object
        Actions actions = new Actions(driver);

//        finding draggable element
        WebElement draggableEl = driver.findElement(By.id("draggable"));

//        finding droppable element
        WebElement droppableEl = driver.findElement(By.id("droppable"));

//        drag and drop
        actions.dragAndDrop(draggableEl, droppableEl).perform();
        Thread.sleep(3000);

        driver.quit();
    }
}
