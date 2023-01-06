package alerts_iFrame_windows_tabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        webDriver.get("https://demoqa.com/alerts");

/*//        JavaScript alert
        webDriver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();

//        confirmation alert
        webDriver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        System.out.println("Confirmation Alert Message: " + webDriver.switchTo().alert().getText());
        webDriver.switchTo().alert().dismiss();

        Thread.sleep(1000);

//        Prompt alert
        System.out.println(webDriver.findElement(By.id("promtButton")).getText());
        webDriver.findElement(By.id("promtButton")).click();
        webDriver.switchTo().alert().sendKeys("Please Confirm!!!");
        webDriver.switchTo().alert().accept();

        Thread.sleep(3000);*/



//        javascript alert
        webDriver.findElement(By.id("alertButton")).click();

//        Optimization and alert object creation
        Alert alert = webDriver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

//        Confirmation alert
        webDriver.findElement(By.id("confirmButton")).click();
        System.out.println("Confirmation Alert Message: " + alert.getText());
        alert.dismiss();
        Thread.sleep(3000);

////        prompt alert
//        webDriver.findElement(By.id("promtButton")).click();
//        Alert alert2 = webDriver.switchTo().alert();
//        alert2.sendKeys("Please Confirm!!!");
//        alert2.accept();
//        Thread.sleep(3000);


        webDriver.quit();
    }
}
