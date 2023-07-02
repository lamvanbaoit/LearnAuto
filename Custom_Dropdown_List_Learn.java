package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Custom_Dropdown_List_Learn {
    WebDriver driver;
    WebDriverWait explicitWait;
    JavascriptExecutor jsExecutor;

    @BeforeClass
    public void BeforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Wait để áp dụng cho các trạng thái của element (visible/ invisile/ presence/ clickable/..)
        explicitWait = new WebDriverWait(driver, 30);

        // Ép kiểu tường minh
        jsExecutor = (JavascriptExecutor) driver;

        // Wait để tìm element (findElement/findElements)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01_JQuery() {
        driver.get("https://jqueryui.com/resources/demos/selectmenu/default.html");
        By parent = By.xpath("//span[@id='number-button']");
        By child = By.xpath("//li[@class='ui-menu-item']//div");

        selectItemInDropdown(parent, child, "5");
        sleepInSecond(3);

        selectItemInDropdown(parent, child, "15");
        sleepInSecond(3);
    }

    @Test
    public void TC_02_ReactJS() {
        driver.get("https://react.semantic-ui.com/maximize/dropdown-example-selection/");
        By parent = By.xpath("//div[@role='listbox']");
        By child = By.xpath("//div[@role='option']//span");

        selectItemInDropdown(parent, child, "Christian");
    }

    @Test
    public void TC_03_VueJS() {
        driver.get("https://mikerodham.github.io/vue-dropdowns/");
        By parent = By.cssSelector("li.dropdown-toggle");
        By child = By.cssSelector("li.dropdown-menu a");

        selectItemInDropdown(parent, child, "Second Option");
    }

    @Test
    public void TC_04_Angular() {
        driver.get("https://ej2.syncfusion.com/demos/#/bootstrap5/drop-down-list/data-binding.html");

        By parent = By.xpath("//div[@id='local-data']//span[@role='combobox']");
        By child = By.xpath("//ul[@id='games_options']//li[@role='option']");

        selectItemInDropdown(parent, child, "Rugby");
    }

    // nhập dữ liệu vào rồi click
    @Test
    public void TC_05_Editable() {
        driver.get("https://indrimuska.github.io/jquery-editable-select/");

        By parent = By.xpath("//div[@id='no-filtering-place']//input[@type='text']");
        By child = By.xpath("//div[@id='no-filtering-place']//ul[@class='es-list']//li");

        selectItemEditableInDropdown(parent, child, "Audi");
    }

    // chọn nhiều
    @Test
    public void TC_06_Multilpe() {
        driver.get("https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html");

        String[] firstMonth = {"January", "April", "December"};

        By parent = By.xpath("(//button[@class='ms-choice'])[1]");
        By child = By.xpath("(//button[@class='ms-choice'])[1]//following-sibling::div/ul//span");

        selectMultileItemInDropdown(parent, child, firstMonth);
        sleepInSecond(2);
        Assert.assertTrue(areItemSelected(firstMonth));
    }

    // Hàm này được dùng lại nhiều lần (chỉ cần truyền giá trị vào)
    public void selectItemInDropdown(By parentLocator, By childLocator, String expectedItem) {
        // Chờ cho element này được phép click
        // Click vào 1 element cho nó xổ ra tất cả item trong dropdown ra
        explicitWait.until(ExpectedConditions.elementToBeClickable(parentLocator)).click();

        // Wait cho tất cả element được load ra (có trong HTML/ DOM)
        // presence
        explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(parentLocator));

        // Lấy tất cả các item trong dropdown đưa vào 1 list element
        List<WebElement> allItems = driver.findElements(childLocator);
        // Tổng số lượng item trong 1 dropdown bằng bao nhiêu
        System.out.println("Item size: " + allItems.size());

        // Duyệt qua từng cái item
        for (WebElement item : allItems) {
            // Mỗi lần duyệt kiểm tra xem text của item đó có bằng với item mình cần click hay ko
            String actualItem = item.getText().trim();
            System.out.println(actualItem);

            // Nếu item mình cần chọn nó nằm trong view (nhìn thấy được) thì click vào và thoát khỏi ko duyệt nữa
            // Nếu item mình cần chọn không nhìn thấy (che bên dưới) thì scroll xuống và click vào
            if (actualItem.equals(expectedItem)) {
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
                sleepInSecond(2);
                explicitWait.until(ExpectedConditions.elementToBeClickable(item)).click();
                sleepInSecond(2);
                break;
            }
        }
    }

    public void selectItemEditableInDropdown(By parentLocator, By childLocator, String expectedItem) {
        driver.findElement(parentLocator).clear();

        // nhập giá trị tìm kiếm vào
        driver.findElement(parentLocator).sendKeys(expectedItem);
        sleepInSecond(2);

        // Lấy tất cả các item trong dropdown bằng bao nhiêu
        List<WebElement> allItems = driver.findElements(childLocator);
        System.out.println("Item size: " + allItems.size());

        // Duyệt qua từng cái item
        for (WebElement item : allItems) {
            // Mỗi lần duyệt kiểm tra xem text của item đó có bằng với item mình cần click hay ko
            String actualItem = item.getText().trim();
            System.out.println(actualItem);

            // Nếu item mình cần chọn nó nằm trong view (nhìn thấy được) thì click vào và thoát khỏi ko duyệt nữa
            // Nếu item mình cần chọn không nhìn thấy (che bên dưới) thì scroll xuống và click vào
            if (actualItem.equals(expectedItem)) {
                jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
                sleepInSecond(2);
                explicitWait.until(ExpectedConditions.elementToBeClickable(item)).click();
                sleepInSecond(2);
                break;
            }
        }
    }

    public void selectMultileItemInDropdown(By parentLocator, By childLocator, String[] expectedItem) {
        // Chờ cho element này được phép click
        // Click vào 1 element cho nó xổ ra tất cả item trong dropdown ra
        explicitWait.until(ExpectedConditions.elementToBeClickable(parentLocator)).click();

        // Wait cho tất cả element được load ra (có trong HTML/ DOM)
        // presence
        explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(parentLocator));

        // Lấy tất cả các item trong dropdown đưa vào 1 list element
        List<WebElement> allItems = driver.findElements(childLocator);
        // Tổng số lượng item trong 1 dropdown bằng bao nhiêu
        System.out.println("Item size: " + allItems.size());

        // Duyệt qua từng cái item
        for (WebElement childElement : allItems) {
            for (String item : expectedItem) {
                // Mỗi lần duyệt kiểm tra xem text của item đó có bằng với item mình cần click hay ko
                String actualItem = childElement.getText().trim();
                System.out.println(actualItem);

                // Nếu item mình cần chọn nó nằm trong view (nhìn thấy được) thì click vào và thoát khỏi ko duyệt nữa
                // Nếu item mình cần chọn không nhìn thấy (che bên dưới) thì scroll xuống và click vào
                if (actualItem.equals(item)) {
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", childElement);
                    sleepInSecond(2);
                    explicitWait.until(ExpectedConditions.elementToBeClickable(childElement)).click();
                    sleepInSecond(2);

                    List<WebElement> itemSlected = driver.findElements(By.xpath("//li[@class='selected']//input"));
                    System.out.println("Item selected: " + itemSlected.size());
                    if (expectedItem.length == itemSlected.size()) {
                        break;
                    }
                }
            }
        }
    }

    public boolean areItemSelected(String[] months) {
        List<WebElement> itemSelected = driver.findElements(By.xpath("//li[@class='selected']//input"));
        int numberItemSelected = itemSelected.size();

        String allItemSelectedText = driver.findElement(By.xpath("//button[@class='ms-choice']/span[1]")).getText();
        System.out.println("Text đã chọn: " + allItemSelectedText);

        if (numberItemSelected <= 3 && numberItemSelected > 0) {
            boolean status = true;
            for (String item : months) {
                if (!allItemSelectedText.contains(item)) {
                    status = false;
                    return status;
                }
            }
            return status;
        } else if (numberItemSelected >= 12) {
            return driver.findElement(By.xpath("//button[@class='ms-choice']/span[@text()='All selected']"))
                    .isDisplayed();
        } else if (numberItemSelected >= 3 && numberItemSelected < 12) {
            return driver
                    .findElement(By.xpath(
                            "//button[@class='ms-choice']/span[text()='" + numberItemSelected + " of 12 selected']"))
                    .isDisplayed();
        } else {
            return false;
        }
    }

    public int getRadomNumber() {
        Random random = new Random();
        return random.nextInt(100000);
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
