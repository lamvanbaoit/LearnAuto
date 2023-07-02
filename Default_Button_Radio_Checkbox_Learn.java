package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Default_Button_Radio_Checkbox_Learn {
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
    public void TC_01_Button_Default() {
        driver.get("https://www.fahasa.com/customer/account/create");

        sleepInSecond(2);

        By loginButton = By.xpath("//button[@class='fhs-btn-login']");

        clickToElement(By.xpath("//li[@class='popup-login-tab-item popup-login-tab-login']"));
        Assert.assertFalse(driver.findElement(By.xpath("//button[@class='fhs-btn-login']")).isEnabled());

        sendKeyToElement(By.xpath("//input[@id='login_username']"), "ad@ad.ad");
        sendKeyToElement(By.xpath("//input[@id='login_password']"), "123123");

        Assert.assertTrue(driver.findElement(loginButton).isEnabled());

        driver.navigate().refresh();
        clickToElement(By.xpath("//li[@class='popup-login-tab-item popup-login-tab-login']"));

        // remove disable attribute of login button
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled');", driver.findElement(loginButton));
        sleepInSecond(2);
        clickToElement(loginButton);

        String Username = driver
                .findElement(By.xpath("//div[@class='fhs-input-box checked-error']//div[@class='fhs-input-alert']"))
                .getText();
        Assert.assertEquals("Thông tin này không thể để trống", Username);

        String Password = driver
                .findElement(By.xpath(
                        "//div[@class='fhs-input-box fhs-input-display checked-error']//div[@class='fhs-input-alert']"))
                .getText();
        Assert.assertEquals("Thông tin này không thể để trống", Password);
    }

    @Test
    public void TC_02_Radio_Default() {
        driver.get("https://demos.telerik.com/kendo-ui/radiobutton/index");

        By petroTwo = By.xpath("//label[text()='2.0 Petrol, 147kW']/preceding-sibling::input");

        Assert.assertFalse(driver.findElement(petroTwo).isSelected());

        driver.findElement(petroTwo).click();
        sleepInSecond(2);

        Assert.assertTrue(driver.findElement(petroTwo).isSelected());
    }

    @Test
    public void TC_03_Checkbox_Default() {
        driver.get("https://demos.telerik.com/kendo-ui/checkbox/index");

        By language = By.xpath("//label[text()='Luggage compartment cover']/preceding-sibling::input");

        Assert.assertFalse(driver.findElement(language).isSelected());

        driver.findElement(language).click();
        sleepInSecond(2);

        Assert.assertTrue(driver.findElement(language).isSelected());

        driver.findElement(language).click();
        sleepInSecond(2);

        Assert.assertFalse(driver.findElement(language).isSelected());
    }

    public void sendKeyToElement(By by, String value) {
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(value);
    }

    public void clickToElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
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
