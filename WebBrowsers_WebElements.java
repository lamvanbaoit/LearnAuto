package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebBrowsers_WebElements {
    // Khai báo biến driver
    WebDriver driver;

    // Chạy đầu tiên: để mở browser/ khởi tạo data test/ khởi tạo biến/..
    @BeforeTest
    public void initData() {
        // Khởi tạo cái browser lên (Mở browser)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://live.guru99.com");
    }

    // Testcase để thực thi
    @Test
    public void TC_01_WebBrowserAPI() throws InterruptedException {
        // Mở ra 1 Url
        // driver.get("http://live.guru99.com");

        // Đóng cái browser nếu như 1 cửa sổ/ nhiều cửa số chỉ đóng tab nó đang đứng
        // (active) -> Handle Windows/ Tabs
        driver.close();

        // Đóng cái browser
        driver.quit();

        // Get ra cái Url của cái page hiện tại
        String homePageUrl = driver.getCurrentUrl();

        // Trả về source code của page hiện tại: html/ css/ jquery/ js/...
        String homePageSource = driver.getPageSource();

        // Trả về Title của page hiện tại
        String homePageTitle = driver.getTitle();

        // Trong bài xử lí Windows/ Tabs
        driver.getWindowHandle();
        driver.getWindowHandles();

        // Chờ cho element được tìm thấy
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Chờ cho page được load thành công
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        // Test GUI: Graphic User Interface
        driver.manage().window().maximize();

        // back/forward/refresh
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // Tracking lại history
        driver.navigate().to("http://live.guru99.com");

        // Alert/ Iframe (Frame)/ Windows
        driver.switchTo().alert().accept();
        driver.switchTo().frame("");
        driver.switchTo().window("");
    }

    // Testcase để thực thi
    @Test
    public void TC_02_WebElementAPI() {
        // Tìm 1 element (nhiều) vs locator là gì

        // Cách 1: Nếu như mà element này chỉ dùng 1 lần
        driver.findElement(By.id("search")).sendKeys("Samsung");
        driver.findElement(By.id("click")).click();

        // Cách 2: Nếu như mà element này thao tác nhiều lần -> Khai báo biến
        WebElement element = driver.findElement(By.id("name"));

        // Click vào 1 element: button/ link/ radio/ checkbox/..
        element.click();

        // Tìm và thao tác vs 1 element: findElement
        element.findElement(By.id("name")).click();

        // Tìm và thao tác vs nhiều element: findElements
        element.findElements(By.id("name")).get(0).click();

        // 0 1 2 3 4 5 -> index
        // A B C X Y Z -> data

        // Work vs form (login/ register) -> Tagname = form
        element.submit();

        // Nhập dữ liệu vào 1 textbox/ textarea
        element.sendKeys("");

        // Xóa dữ liệu trước khi sendkey
        element.clear();

        // Trả về text của 1 element: link/ button/ label/...
        String textElement = element.getText();
        // assertTrue/False
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.isEnabled());

        // Work vs Radio/Checkbox
        Assert.assertTrue(element.isSelected());

        // @attribute
        String getElementAttribute = element.getAttribute("");

        // Test GUI: font/ size/ color/ position/ size/....
        String getElementCssValue = element.getCssValue("");
    }

    // Chạy cuối cùng: đóng browser/ clean data/..
    @AfterTest
    public void cleanData() {
        // Đóng browser sau khi chạy xong all testcases
        driver.quit();
    }
}
