package javaTester;


public class Topic_04_Array_BT_2 {
    // Thuộc tính của học sinh
    private int id;
    private String name;
    private int age;
    private double score;

    // Hàm khởi tạo
    public Topic_04_Array_BT_2(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        // Khởi tạo một đối tượng học sinh
        Topic_04_Array_BT_2 student = new Topic_04_Array_BT_2(1, "John Doe", 18, 8.5);

        // Hiển thị thông tin học sinh
        student.display();
    }
}

