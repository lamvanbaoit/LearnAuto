package javaTester;

import java.util.Scanner;

public class Topic_03 {
    static Scanner scanner = new Scanner(System.in);

    public static void EX_01() {
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();

//        int number = 9;
        if (number % 2 == 0) {
            System.out.println("Số: " + number + " là số chẵn");
        } else {
            System.out.println("Số: " + number + " là số lẻ");
        }
    }


    public static void EX_02() {
        System.out.print("Nhập số A: ");
        int numberA = scanner.nextInt();
        System.out.print("Nhập số B: ");
        int numberB = scanner.nextInt();

        if (numberA > numberB) {
            System.out.println(numberA + " lớn hơn " + numberB);
        } else if (numberA == numberB) {
            System.out.println(numberA + " bằng " + numberB);
        } else {
            System.out.println(numberA + " nhỏ hơn " + numberB);
        }
    }

    public static void EX_03() {
        System.out.print("Nhập tên A: ");
        String firstName = scanner.nextLine();
        System.out.print("Nhập tên B: ");
        String secondName = scanner.nextLine();

        // kiểu Referency: String
        if (firstName.equals(secondName)) {
            System.out.println("Hai tên giống nhau");
        } else {
            System.out.println("Hai tên khác nhau");
        }

        // kiểu primitive type
        if (firstName == secondName) {
            System.out.println("Hai tên giống nhau");
        } else {
            System.out.println("Hai tên khác nhau");
        }
    }

    public static void EX_04() {
        System.out.print("Nhập số A: ");
        int numberA = scanner.nextInt();
        System.out.print("Nhập số B: ");
        int numberB = scanner.nextInt();
        System.out.print("Nhập số C: ");
        int numberC = scanner.nextInt();

        if (numberA > numberB && numberA > numberC) {
            System.out.println(numberA + " là số lớn nhất");
        } else if (numberB > numberC) {
            System.out.println(numberB + " là số lớn nhất");
        } else {
            System.out.println(numberC + " là số lớn nhất");
        }
    }

    public static void EX_05() {
        System.out.print("Nhập số A: ");
        int numberA = scanner.nextInt();

        if (10 < numberA && numberA < 1000) {
            System.out.println(numberA + " nằm trong khoảng (10 - 100)");
        } else {
            System.out.println(numberA + " nằm ngoài khoảng (10 - 100)");
        }
    }

    public static void EX_06() {
        System.out.print("Nhập số A: ");
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 ngày");
        } else if (month == 2) {
            System.out.println("28 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 ngày");
        }
    }

    public static void EX_07() {
        System.out.print("Nhập số A: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngày");
                break;
            case 2:
                System.out.println("28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngày");
                break;
            default:
                break;
        }
    }

    public static void EX_08() {
        System.out.print("Nhập số A: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                break;
        }
    }

    public static void Ex_09() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên n: ");
        int n = scanner.nextInt();

        // Sử dụng vòng lặp để hiển thị các số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void Ex_10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        // Sử dụng vòng lặp để hiển thị các số từ a đến b
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }

    public static void Ex_11() {
        int sum = 0;

        // Sử dụng vòng lặp để duyệt qua các số từ 1 đến 10
        for (int i = 1; i <= 10; i++) {
            // Kiểm tra xem số hiện tại có phải là số chẵn hay không
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i; // Tính tổng các số chẵn
            }
        }

        System.out.println("Tổng các số chẵn từ 1 đến 10 là: " + sum);
    }

    public static void Ex_12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        int sum = 0;
        // Sử dụng vòng lặp để hiển thị các số từ a đến b
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("Tổng các số từ a đến b là: " + sum);
    }

    public static void Ex_13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Sử dụng vòng lặp để tính tổng các số lẻ từ 0 đến n
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Tổng các số lẻ từ 0 đến " + n + " là: " + sum);
    }
    public static void Ex_14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Các số chia hết cho 3 từ " + a + " đến " + b + " là: ");

        // Sử dụng vòng lặp để kiểm tra và hiển thị các số chia hết cho 3
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Ex_15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int n = scanner.nextInt();

        int factorial = 1;

        // Tính giai thừa của n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }

    public static void Ex_16() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        System.out.println("Các số chẵn từ " + n + " đến 100 là:");

        int currentNumber = n;

        // Sử dụng vòng lặp do-while để hiển thị các số chẵn
        do {
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        } while (currentNumber <= 100);
    }
    public static void Ex_17() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Các số chia hết cho cả 3 và 5 từ " + a + " đến " + b + " là:");

        int currentNumber = a;

        // Sử dụng vòng lặp while để kiểm tra và hiển thị các số chia hết cho cả 3 và 5
        while (currentNumber <= b) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        }
    }

    public static void Ex_18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // Tính tổng các số lẻ từ 0 đến n
        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("Tổng các số lẻ từ 0 đến " + n + " là: " + sum);
    }

    public static void Ex_19() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Các số chia hết cho 3 trong khoảng từ " + a + " đến " + b + " là:");

        int currentNumber = a;

        // Kiểm tra và hiển thị các số chia hết cho 3 trong khoảng từ a đến b sử dụng vòng lặp do-while
        do {
            if (currentNumber % 3 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        } while (currentNumber <= b);
    }

    public static void Ex_20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        // Tính giai thừa của n sử dụng vòng lặp do-while
        do {
            factorial *= i;
            i++;
        } while (i <= n);

        System.out.println("Giai thừa của " + n + " là: " + factorial);

    }

    public static void Ex_21() {
        int number = 1;
        int sum = 0;

        // Tính tổng các số chẵn từ 1 đến 10 sử dụng vòng lặp do-while
        do {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        } while (number <= 10);

        System.out.println("Tổng các số chẵn từ 1 đến 10 là: " + sum);

    }


    public static void main(String[] args) {
//        EX_01();
//        EX_02();
//        EX_03();
//        EX_04();
//        EX_05();
//        EX_06();
//        EX_07();
//        EX_08();
//        Ex_09();
//        Ex_10();
//        Ex_11();
//        Ex_12();
//        Ex_13();
//        Ex_14();
//        Ex_15();
//        Ex_16();
//        Ex_17();
//        Ex_18();
//        Ex_19();
//        Ex_20();
//        Ex_21();
    }
}
