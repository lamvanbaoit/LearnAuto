package javaTester;


public class Topic_04_Array_BT {
    public static void Ex01() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7};

        // Tìm phần tử lớn nhất
        int max = numbers[0]; // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Hiển thị phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }

    public static void Ex02() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7};

        // Tính tổng phần tử đầu tiên và cuối cùng
        int sum = numbers[0] + numbers[numbers.length - 1];

        // Hiển thị tổng
        System.out.println("Tổng phần tử đầu tiên và cuối cùng là: " + sum);

    }

    public static void Ex03() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7, 4, 6};

        // In ra các số chẵn trong mảng
        System.out.print("Các số chẵn trong mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void Ex04() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7, 4, 6};

        // Tính tổng các số lẻ lớn hơn 0
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] % 2 != 0)
            {
                System.out.println(numbers[i]);
                sum += numbers[i];
            }
        }

        // Hiển thị tổng
        System.out.println("Tổng các số lẻ lớn hơn 0 trong mảng là: " + sum);

    }

    public static void Ex05() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 10, 11, -1};

        // Hiển thị những số từ 0 đến 10 trong mảng
        System.out.print("Những số từ 0 đến 10 trong mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] <= 10) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void Ex06() {
        // Mảng số nguyên
        int[] numbers = {5, 2, 9, 1, 7};

        // Tính tổng các giá trị phần tử
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / numbers.length;

        // Hiển thị tổng và trung bình cộng
        System.out.println("Tổng các giá trị phần tử trong mảng là: " + sum);
        System.out.println("Trung bình cộng của các giá trị phần tử trong mảng là: " + average);

    }

    public static void main(String[] args) {
//        Ex06();
//        Ex05();
//        Ex04();
//        Ex03();
//        Ex02();
//        Ex01();
    }
}

