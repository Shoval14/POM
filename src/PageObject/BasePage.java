package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public  WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
      wait = new WebDriverWait(driver, Duration.ofSeconds(65));
    }
    //Click Method
    public void click(By elementLocation){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation , String text){
        waitVisibility(elementLocation);
        WebElement filed =driver.findElement(elementLocation);
        filed.clear();
        filed.sendKeys();
    }

//Wait
    public void waitVisibility(By by){
        try {
            Thread.sleep(1500);
        }catch ( InterruptedException e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
}
