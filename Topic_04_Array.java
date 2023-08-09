package javaTester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_04_Array {
    public static void main(String[] args) {
        // Khai báo mảng với kiểu dữ liệu nguyên thủy:
        int[] numbers1;

        // Khai báo mảng và cấp phát bộ nhớ ngay lập tức:
        int[] numbers2 = new int[5]; // Mảng numbers có 5 phần tử kiểu int
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;

        // Truy cập mảng
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // Khai báo mảng và khởi tạo giá trị cho mảng đó trong cùng một dòng.
        int[] numbers3 = new int[] {1,3,5,7,9};
        System.out.println(numbers3[3]);
        System.out.println(Arrays.toString(numbers3));

        // Khai báo mảng và khởi tạo giá trị ngay lập tức:
        String[] fruits = {"apple", "banana", "orange"};
        System.out.println(fruits[2]);
        System.out.println(Arrays.toString(fruits));

        // Khai báo mảng đối tượng:
        Student[] students = new Student[3]; // Mảng students có 3 phần tử kiểu Student

        // Cố định
        String[] studentName = {"Lam", "Van", "Bao"};

        // Truy cập mảng
        for (int i = 0; i < studentName.length; i++) {
            System.out.println(studentName[i]);
        }

        // Truy cập mảng
        for (String std: studentName) {
            System.out.println(std);
        }

        // Động
        ArrayList<String> stdName = new ArrayList<String>();
        stdName.add("Alice");
        stdName.add("Bob");
        stdName.add("Charlie");

        // Truy cập mảng
        for (String std: stdName) {
            System.out.println(std);
        }

    }
}
