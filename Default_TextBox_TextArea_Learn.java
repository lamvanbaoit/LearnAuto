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

import java.util.Random;

public class Default_TextBox_TextArea_Learn {
    WebDriver driver;
    String loginPageUrl, userID, password;
    String customerID;
    JavascriptExecutor jsExecutor;
    String loginUrl = "https://demo.guru99.com/v4/";

    // Input in New Customer
    String name = "Jason Staham";
    String gender = "male";
    String dateOfBirthInput = "01/01/1970";
    String dateOfBirthOutput = "1970-01-01";
    String addressInput = "689 PO Bridge\nCalifornia";
    String addressOutput = "689 PO Bridge California";
    String city = "Los Angeles";
    String state = "California";
    String pin = "225588";
    String phone = "0855556393";
    String email = "baolam" + getRandomNumber() + "@email.com";

    // Locator for New Customer
    By nameTextboxBy = By.name("name");
    By genderRadioBy = By.xpath("//input[@value='m']");
    By genderTextboxBy = By.name("gender");
    By dateOfBirthTextboxBy = By.name("dob");
    By addressTextAreaBy = By.name("addr");
    By cityTextboxBy = By.name("city");
    By stateTextboxBy = By.name("state");
    By pinTextboxBy = By.name("pinno");
    By phoneTextboxBy = By.name("telephoneno");
    By emailTextboxBy = By.name("emailid");
    By passwordTextboxBy = By.name("password");

    @BeforeClass
    public void BeforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Ép kiểu tường minh
        jsExecutor = (JavascriptExecutor) driver;

        driver.manage().window().maximize();

        driver.get(loginUrl);
    }

    @Test
    public void TC_01_Register() {
        loginPageUrl = driver.getCurrentUrl();
        driver.findElement(By.xpath("//a[normalize-space()='here']")).click();
        sleepInSecond(7);
        driver.findElement(By.name("emailid")).sendKeys("ad@ad.ad");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        userID = driver.findElement(By.xpath("//td[text()='User ID :']//following-sibling::td")).getText();
        // System.out.println(userID);
        password = driver.findElement(By.xpath("//td[text()='Password :']//following-sibling::td")).getText();
        // System.out.println(password);
    }

    @Test
    public void TC_02_Login() {
        driver.get(loginPageUrl);
        driver.findElement(By.name("uid")).sendKeys(userID);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement((By.name("btnLogin"))).click();

        Assert.assertTrue(driver.findElement(By.xpath("//marquee[@class='heading3']")).isDisplayed());
    }

    @Test
    public void TC_03_New_Customer() {
        driver.findElement(By.xpath("//a[text()='New Customer']")).click();
        sleepInSecond(5);
        driver.findElement(nameTextboxBy).sendKeys(name);
        driver.findElement(genderRadioBy).click();
        jsExecutor.executeScript("arguments[0].removeAttribute('type')", driver.findElement(dateOfBirthTextboxBy));
        driver.findElement(dateOfBirthTextboxBy).sendKeys(dateOfBirthInput);
        driver.findElement(addressTextAreaBy).sendKeys(addressInput);
        driver.findElement(cityTextboxBy).sendKeys(city);
        driver.findElement(stateTextboxBy).sendKeys(state);
        driver.findElement(pinTextboxBy).sendKeys(pin);
        driver.findElement(phoneTextboxBy).sendKeys(phone);
        driver.findElement(emailTextboxBy).sendKeys(email);
        driver.findElement(passwordTextboxBy).sendKeys(password);

        driver.findElement(By.name("sub")).click();

        Assert.assertTrue(
                driver.findElement(By.xpath("//p[@class='heading3' and text()='Customer Registered Successfully!!!']"))
                        .isDisplayed());
        Assert.assertEquals(name,
                driver.findElement(By.xpath("//td[text()='Customer Name']/following-sibling::td")).getText());
        Assert.assertEquals(gender,
                driver.findElement(By.xpath("//td[text()='Gender']//following-sibling::td")).getText());
        Assert.assertEquals(dateOfBirthOutput,
                driver.findElement(By.xpath("//td[text()='Birthdate']//following-sibling::td")).getText());
        Assert.assertEquals(addressOutput,
                driver.findElement(By.xpath("//td[text()='Address']//following-sibling::td")).getText());
        Assert.assertEquals(city, driver.findElement(By.xpath("//td[text()='City']//following-sibling::td")).getText());
        Assert.assertEquals(state,
                driver.findElement(By.xpath("//td[text()='State']//following-sibling::td")).getText());
        Assert.assertEquals(pin, driver.findElement(By.xpath("//td[text()='Pin']//following-sibling::td")).getText());
        Assert.assertEquals(phone,
                driver.findElement(By.xpath("//td[text()='Mobile No.']//following-sibling::td")).getText());
        Assert.assertEquals(email,
                driver.findElement(By.xpath("//td[text()='Email']//following-sibling::td")).getText());

        customerID = driver.findElement(By.xpath("//td[text()='Customer ID']//following-sibling::td")).getText();
        System.out.println(customerID);
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100000);
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

