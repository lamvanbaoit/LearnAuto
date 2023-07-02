package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Default_Dropdown_List_Learn {
    WebDriver driver;
    Select select;

    @BeforeClass
    public void BeforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test
    public void TC_01_NopCommerce() {
        String firstName = "Dao";
        String lastName = "Binh";
        String day = "12";
        String month = "April";
        String year = "2000";

        driver.findElement(By.xpath("//div[@class='header']//li[1]//a")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);

        WebElement a =  driver.findElement(By.name("DateOfBirthDay"));
        select = new Select(a);

//		chọn 1 item
//      select.selectByIndex(0);
//      select.selectByValue(day);
        select.selectByVisibleText(day);

        // bỏ chọn 1 item
//      select.selectByIndex(0);

        select = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByIndex(1);

        select = new Select(driver.findElement(By.name("DateOfBirthYear")));
        select.selectByValue(year);
    }

    public void sleepInSecond(long timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
