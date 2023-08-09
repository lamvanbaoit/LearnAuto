package javaTester;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Topic_02_Data_Type_01 {
    //	Primitive
//	byte: kiểu số nguyên 8 bit
//	short: kiểu số nguyên 16 bit
//	int: kiểu số nguyên 32 bit
//	long: kiểu số nguyên 64 bit
//	float: kiểu số thực 32 bit
//	double: kiểu số thực 64 bit
//	boolean: kiểu logic (true hoặc false)
//	char: kiểu ký tự Unicode 16 bit

    // Reference type: Tham chiếu

    // String
    String address = "Ho Chi Minh";

    // Array
    String[] studentAddress = {"a", address};
    Integer[] studentNumber = {1, 2, 3};

    // Class
    Topic_02_Data_Type topic;

    // Interfaces
//    WebDriver driver;

    // Object
    Object isObject;

    // Collection
    // List/ Set/ Queue/ Map
//    List<WebElement> homePageLinks = driver.findElements(By.xpath(""));
//    Set<String> allWindows = driver.getWindowHandles();

    // ArrayList implement List
    List<String> productName = new ArrayList<>();

    public static void main(String[] args) {

    }
}

