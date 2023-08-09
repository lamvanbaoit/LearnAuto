package javaTester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_04_Array_BT_1 {

    // phương thức của mảng Arrays.asList
    public static void ArraysAsList() {
        // Khai báo và khởi tạo một mảng nguyên
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Chuyển đổi mảng thành danh sách
        List<Integer> numberList = Arrays.asList(numbers);

        // In ra danh sách
        System.out.println(numberList);

//            Lưu ý rằng phương thức Arrays.asList() trả về một danh sách không thể thay đổi kích thước (fixed-size list),
//            điều này có nghĩa là không thể thêm hoặc xóa phần tử từ danh sách sau khi chuyển đổi.

    }

    // phương thức của mảng ArrayList
    public static void ArrayList() {
        // Khai báo và khởi tạo một mảng chuỗi
        String[] fruits = {"apple", "banana", "orange"};

        // Chuyển đổi mảng thành danh sách
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruits));
        System.out.println(fruitList);
        // Thêm một phần tử mới vào danh sách
        fruitList.add("grape");
        fruitList.add("thenion");

        // Xóa một phần tử từ danh sách
        fruitList.remove("banana");

        // In ra danh sách sau khi thay đổi kích thước
        System.out.println(fruitList);
    }


    public static void main(String[] args) {
        ArraysAsList();
        ArrayList();
    }

}
