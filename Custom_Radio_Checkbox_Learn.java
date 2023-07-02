package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Custom_Radio_Checkbox_Learn {
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    @BeforeClass
    public void BeforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Ép kiểu tường minh
        jsExecutor = (JavascriptExecutor) driver;

        // Wait để tìm element (findElement/findElements)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01_Radio_Customer() {
        driver.get("https://material.angular.io/components/radio/examples");

        By inputWinterRadioButton = By.xpath("//input[@value='Winter']");

        // Cách 1 dự án thực tế
        // Dùng hàm click của javascript
        // Click vào 1 element bị ẩn được
        // remove disable attribute of login button
        sleepInSecond(3);
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(inputWinterRadioButton));
        Assert.assertTrue(driver.findElement(inputWinterRadioButton).isSelected());
    }

    @Test
    public void TC_02_Radio_Customer_C2() {
        driver.get("https://material.angular.io/components/radio/examples");

        // Cách 2
        // Dùng thẻ span để click
        By spanWinterRadioButton = By.xpath("//label[@for='mat-radio-2-input']");
        // Dùng thẻ input để verify
        By inputWinterRadioButton = By.xpath("//input[@value='Winter']");

        driver.findElement(spanWinterRadioButton).click();
        Assert.assertTrue(driver.findElement(inputWinterRadioButton).isSelected());
    }


    @Test
    public void TC_02_Checkbox_Customer() {
        driver.get("https://material.angular.io/components/checkbox/examples");
        By inputCheckBoxChecked = By.xpath("//input[@id='mat-mdc-checkbox-1-input']");
        By inputCheckBoxIndeterminate = By.xpath("//input[@id='mat-mdc-checkbox-2-input']");

        jsExecutor.executeScript("arguments[0].click();", driver.findElement(inputCheckBoxChecked));
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(inputCheckBoxIndeterminate));

        Assert.assertTrue(driver.findElement(inputCheckBoxChecked).isSelected());
        Assert.assertTrue(driver.findElement(inputCheckBoxIndeterminate).isSelected());
    }

    public void sleepInSecond(long timeInSecond) {
        try {
            Thread.sleep(timeInSecond * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
