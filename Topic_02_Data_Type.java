package javaTester;

public class Topic_02_Data_Type {
//    256/8 = 32 số
//    8 bit = 256 số
//    1 byte = 256 số
//    1 byte = 8 bit

    // primitive types (kiểu nguyên thủy)
//    Kiểu số nguyên (Integer types)
    static byte age = 25;
    static  int number = 10;
    static short population = 20000;
    static long distance = 150000; // thể ko để chữ L
//    Kiểu số thực (Floating-point types)
    static float pi = 3.14f;
    static double salary = 5000.50;
//    Kiểu ký tự (Character type)
    static char grade = 'A';
    static char letter = '\u005A'; // Unicode của ký tự 'Z'
//    Kiểu boolean
    static boolean isActive = true;
    static boolean isFound = false;
    // Non-primitive (reference types) (kiểu tham chiếu)
//    Kiểu chuỗi (String type):
    static String name = "John Doeklfaefklawnfakwfliawhf f;lmalef22312 Q!!";
    static String message = "Hello, World!";
//    Kiểu mảng (Array type)
// Mảng kiểu số nguyên:
    static int numbers[] = {1, 2, 3, 4, 5};
// Mảng kiểu số thực:
    static double[] prices = {19.99, 29.99, 39.99};
// Mảng kiểu chuỗi:
    static String[] names = {"Alice", "Bob", "Charlie"};
// Mảng kiểu boolean:
    static boolean[] flags = {true, false, true};
// Mảng 2 chiều:
    static int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


    public static void main(String[] args) {
//        System.out.println(age);
//        System.out.println(number);
//        System.out.println(population);
//        System.out.println(distance);
//        System.out.println(pi);
//        System.out.println(salary);
//        System.out.println(grade);
//        System.out.println(letter);
//        System.out.println(isActive);
//        System.out.println(isFound);
//        System.out.println(name);
//        System.out.println(message);
        System.out.println(numbers[5]);
        System.out.println(prices[1]);
        System.out.println(names[0]);
        System.out.println(flags[2]);
        System.out.println(matrix[1][1]);

        // Lớp (Class):
        // Khởi tạo mảng đối tượng Student
        Student[] students = new Student[3];

        // Gán giá trị cho từng phần tử trong mảng
        students[0] = new Student("Alice", 20, "Computer Science");
        students[1] = new Student("Bob", 21, "Mathematics");
        students[2] = new Student("Charlie", 19, "Physics");

        // Hiển thị thông tin của từng sinh viên trong mảng
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }

        // Giao diện (Interface):
        Drawable drawable = new Circle();
        drawable.draw();

        // Kiểu liệt kê (Enum type):
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Today is " + today);
    }
}

// Lớp (Class):
class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("-----------------------");
    }

}

// Giao diện (Interface):
interface Drawable {
    void draw();
}

// Giao diện (Interface):
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Kiểu liệt kê (Enum type):
enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
